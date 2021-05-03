public class App {
    int[] nums = {1, 10, 8, 3, 6, 2};
    public static void main(String[] args) throws Exception {
        App Obj = new App();
        int[] nums = Obj.nums;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
