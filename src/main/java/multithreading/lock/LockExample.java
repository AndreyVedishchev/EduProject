package multithreading.lock;

import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    public static void main(String[] args) {
//        manualStreams();
//        runnableStreams();
        callableStreams();
    }

    /**
     * создание и запуск потоков Callable
     */
    static void callableStreams() {
        Callable<Integer> rndValue = () -> new Random().nextInt(100);
        ExecutorService pool = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 50; i++) {
            Future<Integer> task = pool.submit(rndValue);
            try {
//                while (!task.isDone()) {
//                    Thread.sleep(1);
//                }
                System.out.println(task.get());
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        pool.shutdown();
    }

    /**
     * создание и запуск потоков Runnable
     */
    static void runnableStreams() {
        Runnable countThread = () -> {
            try {
                int x = 1;
                for (int i = 0; i < 5; i++) {
                    System.out.printf("%s %d \n", Thread.currentThread().getName(), x);
                    x++;
                    Thread.sleep(100);
                }

            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        };

        ExecutorService pool = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            pool.execute(countThread);
        }
        pool.shutdown();
    }

    /**
     * ручное создание и запуск потоков
     */
    static void manualStreams() {
        CommonRsource cr = new CommonRsource();
        ReentrantLock locker = new ReentrantLock();
        for (int i = 1; i < 6; i++) {
            Thread t = new Thread(new CountThread(cr, locker));
            t.setName("Thread " + i);
            t.start();
        }
    }
}

class CommonRsource {
    int x = 0;
}

class CountThread implements Runnable {

    CommonRsource res;
    ReentrantLock locker;

    public CountThread(CommonRsource res, ReentrantLock locker) {
        this.res = res;
        this.locker = locker;
    }

    @Override
    public void run() {
        
        locker.lock();
        try {
            res.x = 1;
            for (int i = 1; i < 5; i++) {
                System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
                res.x++;
                Thread.sleep(100);
            }

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            locker.unlock();
        }
    }
}