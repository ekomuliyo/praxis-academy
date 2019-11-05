/*
 * synchronized adalah suatu metode mengeksekusi sumber daya tertentu dengan menggunakan lock,
 * maksud lock disini adalah sumber daya akan di lock/kunci tidak dapat di akses sampai thread tersebut selesai,  
 * artinya adalah seandainya dalam satu waktu ada 2 thread atau proses mengakses sumber daya yang sama,
 * kalau tidak menggunakan syncrhonized hasil nya pasti akan bingung atau kacau,
 * nahh dengan menggunakan synchronized, setiap proses nya di urutkan berdasarkan thread yang dieksekusi sampai selesai
 * 
 */
package methodSynchronized;

public class App {

    public static void main(String[] args) {
        Resource resource = new Resource();
        Thread1 thread1 = new Thread1(resource);
        Thread2 thread2 = new Thread2(resource);
        
        thread1.start();
        thread2.start();

    }
}

class Resource{
    // synchronized method
    // mengeksuksi synchronized satu baris printah method ini prinTable(int n)
    synchronized void printTable(int n){
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread saat ini adalah : " + Thread.currentThread().getName() + " dan perulangan ke - " + i);
            System.out.format("%d x %d = %d", i, n, i*n);
            System.out.println("\n");
            try {
                Thread.sleep(1000); // 1000 millisecond = 1 detik
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    // synchronized block
    // mengeksuksi synchronized pada baris yang ada synchronized
    // void printTable(int n){
    //     System.out.println("ini tidak akan di eksekusi sebagai synchronized");
    //     synchronized (this){
    //         for (int i = 0; i < 5; i++) {
    //             System.out.println("Thread saat ini adalah : " + Thread.currentThread().getName() + " dan perulangan ke - " + i);
    //             System.out.format("%d x %d = %d", i, n, i*n);
    //             System.out.println("\n");
    //             try {
    //                 Thread.sleep(1000); // 1000 millisecond = 1 detik
    //             } catch (Exception e) {
    //                 e.printStackTrace();
    //             }
    //         }
    //     }
    // }
}

class Thread1 extends Thread{
    Resource resource;

    Thread1(Resource r){
        resource = r;
    }

    public void run(){
        resource.printTable(5);
    }
}

class Thread2 extends Thread{
    Resource resource;

    Thread2(Resource r){
        resource = r;
    }

    public void run(){
        resource.printTable(10);
    }
}
