package static_;

import java.util.Arrays;

public class ArrayUtils {

    //поиск максимального элемента
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //сортировки массива
    public static int[] getSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

    //проверка на упорядоченность
    public static boolean checkSort(int[] arr) {
        if (arr.length <= 1) {
            return true;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(checkSort(arr));
        System.out.println(checkSort(nums));

        System.out.println(getMax(nums));
        System.out.println(Arrays.toString(getSort(nums)));

    }
}
