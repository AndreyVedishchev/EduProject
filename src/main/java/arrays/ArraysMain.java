package arrays;

public class ArraysMain {

    public static int summElements(int[] arr) {
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }

    public static int maxSumm(int[] nums) {
        int local_sum = 0;
        int global_sum = 0;

        for (int i = 0; i < nums.length; i++) {
            local_sum = Math.max(nums[i], nums[i] + local_sum);
            global_sum = Math.max(local_sum, global_sum);
        }
        return global_sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(ArraysMain.summElements(arr));

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(ArraysMain.maxSumm(nums));

    }
}
