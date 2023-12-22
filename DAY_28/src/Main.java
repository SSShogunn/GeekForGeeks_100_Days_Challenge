public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Complete{

    public static int minSwap (int arr[], int n, int k) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= k) {
                count++;
            }
        }

        int badCount = 0;
        for (int i = 0; i < count; i++) {
            if (arr[i] > k) {
                badCount++;
            }
        }

        int minSwaps = badCount;

        for (int i = count; i < n; i++) {
            if (arr[i - count] > k) {
                badCount--;
            }
            if (arr[i] > k) {
                badCount++;
            }
            minSwaps = Math.min(minSwaps, badCount);
        }

        return minSwaps;
    }
}