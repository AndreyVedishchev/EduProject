package multithreading.store;

public class Consumer implements Runnable{
    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            store.get();
//            try {
//                Thread.sleep(50);
//                store.get();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}
