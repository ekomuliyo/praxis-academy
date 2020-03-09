
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;
/**
 * AtomicAssigment
 */
public class AtomicAssigment implements Runnable{
    private static volatile Map<String, String> configuration = new HashMap<String, String>();

    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println("["+Thread.currentThread().getName()+"] threads - : "+ i);
            Map<String, String> currentConfig = configuration;
            String value1 = currentConfig.get("key-1");
            String value2 = currentConfig.get("key-2");
            String value3 = currentConfig.get("key-3");

            if (!(value1.equals(value2) && value2.equals(value3))) {
                throw new IllegalStateException("Value are not equal.");
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void readConfig(){
        Map<String, String> newConfiguration = new HashMap<String, String>();
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS");
        newConfiguration.put("key-1", simpleDateFormat.format(now));
        newConfiguration.put("key-2", simpleDateFormat.format(now));
        newConfiguration.put("key-3", simpleDateFormat.format(now));
        configuration = newConfiguration;
    }

    public static void main(String[] args) throws InterruptedException{
        readConfig();
        Thread configThread = new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    readConfig();
                    System.out.println("["+Thread.currentThread().getName()+"] threadsConfig - : "+ i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "configuration-thread");

        configThread.start();

        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new AtomicAssigment(), "thread - "+i);
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }

        configThread.join();
        System.out.println("["+ Thread.currentThread().getName()+"] All threads have finished.");

    }
}