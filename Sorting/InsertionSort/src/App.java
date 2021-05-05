public class App {
    int[] nums = {5, 10, 2, 8, 3};

    public static void main(String[] args) throws Exception {
        App Obj = new App();
        int[] nums = Obj.nums;
        int key = 0;
        int j = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            key = nums[i];
            j = i - 1;
            while (j >= 0 && key <= nums[j]) {
                temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
                j--;
            }
        }
        for (Integer i : nums) {
            System.out.println(i);
        }
    }
}