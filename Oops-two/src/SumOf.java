public class SumOf {
    public static int sumOfTwoNumbers(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
        }
        return res;
    }
}
