/**
 * MyRunnable
 */
public class MyRunnable implements Runnable{

    public static void main(String[] args) {
        Thread myThread = new Thread(new MyRunnable(), "myThread");
        myThread.start();
    }

    public void run(){
        System.out.println("Executing thread "+ Thread.currentThread().getName());
    }
}