/*
 * Callable memungkinkan kita dapat mengoperasikan hasil concurent untuk digunakan kedepannya
 */
package Callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {

    private static final int nThreads = 10;
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(nThreads);
        List<Future<Long>> list = new ArrayList<Future<Long>>();
        
        for (int i = 0; i < 2000; i++) {
            Callable<Long> worker = new MyCallable();
            Future<Long> submit = executorService.submit(worker);
            list.add(submit);  
        }

        long sum = 0;
        System.out.println(list.size());

        for (Future<Long> future : list) {
            try {
                sum += future.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }catch(ExecutionException e){
                e.printStackTrace();
            }
        }

        System.out.println(sum);
        executorService.shutdown();
    }
}

class MyCallable implements Callable<Long>{

    @Override
    public Long call() throws Exception {
        long sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        return sum;
    }
    
}