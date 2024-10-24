package collections;

import java.util.Arrays;
import java.util.Objects;

public class MyArrayList {

    private Integer[] arr;

    MyArrayList() {
        arr = new Integer[5];
    }

    void add(int value) {

        //если есть место в существующем массиве, то добавляем в него и выходим
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = value;
                return;
            }
        }

        //если места не нашлось, создаем новый в 2 раза больше, переливаем все в него и после добавляем новое значение
        Integer[] newArr = new Integer[arr.length*2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
        add(value);
    }

    void remove(int index) {
        arr[index] = null;
    }

    int get(int index) {
        return arr[index];
    }

    boolean contains(int value) {
        Integer val = value;
        for (Integer i : arr) {
            if (i == val) {
                return true;
            }
        }
        return false;
    }

    int size() {
        int cnt = 0;
        for (Integer i : arr) {
            if (i != null) {
                cnt++;
            }
        }
        return cnt;
    }

    void print() {
        Arrays.stream(arr).filter(Objects::nonNull).forEach(System.out::println);
    }

    public static void main(String[] args) {
        MyArrayList ml = new MyArrayList();
        ml.add(3);
        ml.add(4);
        ml.add(5);
        ml.add(6);

        ml.print();
    }
}
