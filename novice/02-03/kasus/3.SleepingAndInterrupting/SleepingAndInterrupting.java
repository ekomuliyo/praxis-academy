/**
 * SleepingAndInterrupting
 */
public class SleepingAndInterrupting implements Runnable{
    
    public void run(){
        // Sleep
        // while(true){
        //     doSomething();
        //     try {
        //         Thread.sleep(1000);
        //     } catch (Exception e) {
        //         e.printStackTrace();
        //     }
        // }

        // Interrupting
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            System.out.println("["+Thread.currentThread().getName()+"] Interrupted by exception");
        }
        while(!Thread.interrupted()){
            // System.out.println("when ! Interrupted");
        }
        System.out.println("["+Thread.currentThread().getName()+"] Interrupted for the second time");

    }

    // private void doSomething(){
    //     System.out.println("This is method doSomething()");
    // }

    public static void main(String[] args) throws InterruptedException{
        Thread myThread = new Thread(new SleepingAndInterrupting(), "myThread");
        myThread.start();
        System.out.println("["+ Thread.currentThread().getName() +"] Mulai");

        System.out.println("["+Thread.currentThread().getName()+"] Sleeping in main thread for 5s..");
        Thread.sleep(5000);

        System.out.println("["+Thread.currentThread().getName()+"] Interrupting myThread");
        myThread.interrupt();

        System.out.println("["+Thread.currentThread().getName()+"] Sleeping in main thread for 5s..");
        Thread.sleep(5000);

        System.out.println("["+Thread.currentThread().getName()+"] Interrupting myThread");
        myThread.interrupt();
    }
}