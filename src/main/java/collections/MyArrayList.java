package collections;

public class MyArrayList {

    private Integer[] arr;

    MyArrayList() {
        arr = new Integer[5];
    }

    void add(int value) {

        //если есть место в существующем массиве, то добавляем в него и выходим
        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] == null) {
                this.arr[i] = value;
                return;
            }
        }

        //если места не нашлось, создаем новый в 2 раза больше, переливаем все в него и после добавляем новое значение
        Integer[] newArr = new Integer[this.arr.length*2];
        for (int i = 0; i < this.arr.length; i++) {
            newArr[i] = this.arr[i];
        }
        this.arr = newArr;
        this.add(value);
    }

    void remove(int index) {
        this.arr[index] = null;
    }

    int get(int index) {
        return this.arr[index];
    }

    boolean contains(int value) {
        Integer val = Integer.valueOf(value);
        for (Integer i : this.arr) {
            if (i == val) {
                return true;
            }
        }
        return false;
    }

    int size() {
        int cnt = 0;
        for (Integer i : this.arr) {
            if (i != null) {
                cnt++;
            }
        }
        return cnt;
    }
}
