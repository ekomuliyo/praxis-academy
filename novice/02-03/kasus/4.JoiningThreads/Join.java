import java.util.Random;

/**
 * Join
 */
public class Join implements Runnable{

    private Random ran = new Random(System.currentTimeMillis());

    public static void main(String[] args) throws InterruptedException{
        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Join(), "joinThread - "+ i);
            threads[i].start();
        }
        
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }

        System.out.println("[ "+Thread.currentThread().getName()+" ] All threads have finished");
    }

    public void run(){
        for (int i = 0; i < 100000000; i++) {
            ran.nextInt();
        }
        System.out.println("[ "+Thread.currentThread().getName()+" ] finished.");
    }
}