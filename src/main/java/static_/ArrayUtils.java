package static_;

import java.util.Arrays;

import static java.util.Arrays.sort;

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
    public static int[] getSort(int[] arr) {
        int[] result = new int[arr.length];
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    //проверка на упорядоченность
    public static boolean checkSort(int[] arr) {
        if (arr.length <= 1) {
            return false;
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
