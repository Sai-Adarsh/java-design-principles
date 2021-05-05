import java.util.*;

public class App {
    int[] nums = {1, 10, 2, 8, 5, 7};
    public static void main(String[] args) throws Exception {
        App Obj = new App();
        merge(Obj.nums);

        
    }

    public static void merge(int[] nums) {
        if (nums.length >= 2) {
            int mid = nums.length / 2;
            int[] left = Arrays.copyOfRange(nums, 0, mid);
            int[] right = Arrays.copyOfRange(nums, mid, nums.length - 1);

            merge(left);
            merge(right);

            int i = 0;
            int j = 0;
            int k = 0;

            while (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    nums[k] = left[i];
                    i++;
                }
                else {
                    nums[k] = right[j];
                    j++;
                }
                k++;
            }

            while (i < left.length) {
                nums[k] = left[i];
                i++;
                k++;
            }

            while (j < right.length) {
                nums[k] = right[j];
                j++;
                k++;
            }

        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
