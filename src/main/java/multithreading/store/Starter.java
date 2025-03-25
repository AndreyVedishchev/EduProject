package multithreading.store;

public class Starter {
    public static void main(String[] args) {
        Store store = new Store();
        Producer pr = new Producer(store);
        Consumer cn = new Consumer(store);

        Thread t1 = new Thread(pr);
        Thread t2 = new Thread(cn);

        t1.start();
        t2.start();
    }
}
