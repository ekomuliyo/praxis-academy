/*
 * non blocking adalah sebuah metode mengambil/mengesekusi sesuatu pada waktu yang sama,
 * dengan resource yang berbeda 
 * 
 */
package Nonblocking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public class App {

    private static final int nThreads = 10;

    public static void main(String[] args) {
        final Counter counter  = new Counter();

        List<Future<Integer>> list = new ArrayList<Future<Integer>>();

        ExecutorService executorService = Executors.newFixedThreadPool(nThreads);
        for (int i = 0; i < 20; i++) {
            Callable<Integer> worker = new Callable<Integer>() {
                @Override
                public Integer call() throws Exception{
                    int number = counter.increment();
                    System.out.println(number);
                    return number;
                }
            };
            Future<Integer> submit = executorService.submit(worker);
            list.add(submit);
        }

        executorService.shutdown();

        while (!executorService.isTerminated()) {} // menghentikan executorService jikau sudah selesai
        Set<Integer> set = new HashSet<Integer>();
        for (Future<Integer> future:list) {
            try {
                set.add(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e){
                e.printStackTrace();
            }
        }

        if (list.size() != set.size()) {
            throw new RuntimeException("Double-entries!!");
        }
    }
}

class Counter {
    private AtomicInteger value = new AtomicInteger();

    public int getValue(){
        return value.get();
    }

    public int increment(){
        return value.incrementAndGet();
    }

    public int incrementLongVersion(){
        int oldValue = value.get();
        while (!value.compareAndSet(oldValue, oldValue+1)) {
            oldValue = value.get();
        }

        return oldValue+1;
    }


}
