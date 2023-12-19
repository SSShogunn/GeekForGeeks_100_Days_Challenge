public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class Solution{
    static long trappingWater(int arr[], int n) {
        if (n <= 2) {
            return 0;
        }

        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;
        long trappedWater = 0;

        while (left < right) {
            if (arr[left] <= arr[right]) {
                leftMax = Math.max(leftMax, arr[left]);
                trappedWater += leftMax - arr[left];
                left++;
            } else {
                rightMax = Math.max(rightMax, arr[right]);
                trappedWater += rightMax - arr[right];
                right--;
            }
        }

        return trappedWater;
    }
}
