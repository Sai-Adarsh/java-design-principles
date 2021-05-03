import java.util.*;

public class App {
    int[] nums = {1, 10, 2, 7, 5, 3};    
    public static void main(String[] args) {
        App Obj = new App();
        int[] nums = Obj.nums;
        Arrays.sort(nums);
        for (Integer each_num : nums) {
            System.out.println(each_num);
        }
    }
}