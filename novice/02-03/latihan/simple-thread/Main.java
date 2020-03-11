/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("hello");
        
        Multi multi1 = new Multi();
        
        multi1.start();
        System.out.println("hello");
        
        Multi multi2 = new Multi();
        multi2.start();
        System.out.println("hello");


    }
}

class Multi extends Thread{
    public void run(){
        System.out.println("thread is running...");
    }
}