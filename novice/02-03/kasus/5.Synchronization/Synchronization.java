/**
 * NotSynchronization
 */
public class Synchronization implements Runnable{

    private static int counter = 0;


    public void run(){
        // // test not synchronization
        // while (counter < 10) {
        //     System.out.println("["+Thread.currentThread().getName()+"] before : "+ counter);
        //     counter++;
        //     System.out.println("["+Thread.currentThread().getName()+"] after : "+ counter);
        // }
        while (counter < 10) {
            synchronized (Synchronization.class){
                System.out.println("["+Thread.currentThread().getName()+"] before : "+ counter);
                counter++;
                System.out.println("["+Thread.currentThread().getName()+"] after : "+ counter);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException{
        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Synchronization(), "thread - "+ i);
            threads[i].start();
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }
    }
}