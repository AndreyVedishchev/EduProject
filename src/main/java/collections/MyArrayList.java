package collections;

import java.util.Arrays;

public class MyArrayList {

    private int[] arr;
    private int capacity;

    MyArrayList() {
        arr = new int[5];
        capacity = 0;
    }

    void add(int value) {

        //если есть место в существующем массиве, то добавляем в него и выходим
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && capacity == i) {
                arr[i] = value;
                capacity++;
                return;
            }
        }

        //если места не нашлось, создаем новый в 2 раза больше, переливаем все в него и после добавляем новое значение
        int[] newArr = new int[arr.length*2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
        add(value);
    }

    void remove(int index) {
        if (index > capacity-1 || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < capacity; i++) {
            arr[i] = arr[i+1];
        }
        capacity--;
    }

    int get(int index) {
        if (index > capacity-1 || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
    }

    boolean contains(int value) {
        for (int i = 0; i < capacity; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    int size() {
        return capacity;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr) + " size: " + size();
    }

    public static void main(String[] args) {
        MyArrayList ml = new MyArrayList();
        ml.add(3);
        ml.add(0);
        ml.add(5);
        ml.add(6);
        ml.add(7);
        ml.add(8);

        System.out.println(ml);
        System.out.println(ml.get(5));

        ml.remove(2);
        System.out.println(ml);

        ml.add(9);
        System.out.println(ml);
        System.out.println(ml.contains(1));
    }
}
