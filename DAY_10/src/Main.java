import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution
{
    // Function to merge the arrays.
    public static void merge(long[] arr1, long[] arr2, int n, int m)
    {
        int i = 0, j = 0, k = n - 1;
        while (i <= k && j < m) {
            if (arr1[k] > arr2[j]) {
                long temp = arr1[k];
                arr1[k] = arr2[j];
                arr2[j] = temp;
                j++;
            }
            k--;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}