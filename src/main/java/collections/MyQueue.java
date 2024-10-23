package collections;

public class MyQueue {

    private int len = 5;
    private int[] arr = new int[len];
    private int in = -1;
    private int out = -1;

    public boolean add(int val) {
        if (isFull()) {
            return false;
        } else if (isEmpty()) {
            in = out = 0;
            arr[in] = val;
            return true;
        } else {
            in++;
            arr[in] = val;
            return true;
        }
    }

    public boolean remove() {
        if (isEmpty()) {
            return false;
        } else if (in == 0 && out == 0) {
            in = out = -1;
            return true;
        } else {
            out++;
            return false;
        }
    }

    public int peek() {
        return arr[out];
    }

    public boolean isEmpty() {
        if (in == -1 && out == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (in == len - 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        System.out.println("back: " + myQueue.in);
        System.out.println("front: " + myQueue.out);
        System.out.println("------------------");

        myQueue.add(3);
        myQueue.add(2);
        myQueue.add(1);
        myQueue.add(11);
        System.out.println("добавил 4");

        System.out.println("------------------");
        System.out.println("back: " + myQueue.in);
        System.out.println("front: " + myQueue.out);

        System.out.println("------------------");
        myQueue.remove();
        System.out.println("удалил 1");
        myQueue.remove();
        System.out.println("удалил 1");

        System.out.println("------------------");
        System.out.println("back: " + myQueue.in);
        System.out.println("front: " + myQueue.out);

    }
}
