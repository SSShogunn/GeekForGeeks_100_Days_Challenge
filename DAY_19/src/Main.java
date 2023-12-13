public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class Solution {
    long maxProduct(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }

        long maxEndingHere = arr[0];
        long minEndingHere = arr[0];
        long maxProductSubarray = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < 0) {
                long temp = maxEndingHere;
                maxEndingHere = minEndingHere;
                minEndingHere = temp;
            }

            maxEndingHere = Math.max(arr[i], maxEndingHere * arr[i]);
            minEndingHere = Math.min(arr[i], minEndingHere * arr[i]);

            maxProductSubarray = Math.max(maxProductSubarray, maxEndingHere);
        }

        return maxProductSubarray;
    }
}