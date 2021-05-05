public class App {
    int[] nums = {5, 10, 2, 9, 4, 7};
    public static void main(String[] args) throws Exception {
        App Obj = new App();
        int[] nums = Obj.nums;
        int min_index = 0;
        int temp;

        for (int i = 0; i < nums.length; i++) {
            min_index = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[min_index]) {
                    min_index = j;
                }
            }
            temp = nums[i];
            nums[i] = nums[min_index];
            nums[min_index] = temp;
        }

        for (Integer i : nums) {
            System.out.println(i);
        }
    }
}
