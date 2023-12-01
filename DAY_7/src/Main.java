import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int result = arr[n - 1] - arr[0];

        for (int i = 0; i < n - 1; i++) {
            int subtract = arr[i] - k;
            int add = arr[i] + k;

            if (subtract >= 0) {
                int newMin = Math.min(arr[0] + k, subtract);
                int newMax = Math.max(arr[i + 1] - k, add);
                result = Math.min(result, newMax - newMin);
            }

            if (add <= arr[n - 1]) {
                int newMin = Math.min(arr[0] + k, subtract);
                int newMax = Math.max(arr[i + 1] - k, add);
                result = Math.min(result, newMax - newMin);
            }
        }

        return result;
    }
}