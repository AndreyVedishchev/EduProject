package multithreading.store;

public class Store {
    public int item;

    synchronized void put() {
        while (item >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        item++;
        System.out.println("Производитель положил товар -> " + item);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        notify();
    }

    synchronized void get() {
        while (item < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        item--;
        System.out.println("Потребитель забрал товар -> " + item);
        notify();
    }
}
