package collections;

import java.util.Arrays;

public class MyQueue {

    private int[] arr = new int[5];
    private int rear = -1;
    private int front = -1;


    public boolean add(int val) {
        if (isFull()) {
            return false;
        } else if (isEmpty()) {
            rear = front = 0;
            arr[rear] = val;
            return true;
        } else {
            //если впереди есть место, то сначала добавляю вперед
            if (front > 0) {
                arr[--front] = val;
                return true;
            //иначе добавляю в конец
            } else {
                arr[++rear] = val;
                return true;
            }
        }
    }

    public boolean remove() {
        if (isEmpty()) {
            return false;
        }
        else if (rear == 0 && front == 0) {
            arr[front] = 0;
            rear = front = -1;
            return true;
        }
        else {
            arr[front++] = 0;
            return true;
        }
    }

    public int peek() {
        return arr[front];
    }

    public boolean isEmpty() {
        if (rear == -1 && front == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (rear == arr.length-1 && front == 0) {
            throw new IllegalArgumentException();
        }
        return false;
    }

    @Override
    public String toString() {
        return "front: " + front + " " + Arrays.toString(arr) + " rear: " + rear;
    }

    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue();
        myQueue.add(10);
        myQueue.add(20);
        myQueue.add(30);
        System.out.println(myQueue);
        myQueue.add(40);
        myQueue.add(50);
        System.out.println(myQueue);
        myQueue.remove();
        System.out.println(myQueue);
        myQueue.remove();
        System.out.println(myQueue);

        myQueue.add(60);
        System.out.println(myQueue);
//
//        myQueue.remove();
//        System.out.println(myQueue);
//
//        myQueue.add(70);
//        System.out.println(myQueue);
//
//        myQueue.add(80);
//        System.out.println(myQueue);
    }
}
