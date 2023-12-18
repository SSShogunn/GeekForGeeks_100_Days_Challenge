import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class Solution
{
    public static boolean find3Numbers(int A[], int n, int X) {
        Arrays.sort(A);
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int currentSum = A[i] + A[left] + A[right];
                if (currentSum == X) {
                    return true;
                } else if (currentSum < X) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return false;

    }
}
