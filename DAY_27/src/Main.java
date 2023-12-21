
class Solution {

    public static int smallestSubWithSum(int a[], int n, int x) {
        int start = 0, end = 0;
        int minLength = Integer.MAX_VALUE;
        int currentSum = 0;

        while (end < n) {
            while (currentSum <= x && end < n) {
                currentSum += a[end];
                end++;
            }

            while (currentSum > x && start < n) {
                minLength = Math.min(minLength, end - start);
                currentSum -= a[start];
                start++;
            }
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}