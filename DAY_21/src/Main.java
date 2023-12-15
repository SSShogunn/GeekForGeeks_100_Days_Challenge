import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class Solution {
    public int countOccurence(int[] arr, int n, int k) {
        int requiredCount = n / k;
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            countMap.put(arr[i], countMap.getOrDefault(arr[i], 0) + 1);
        }

        int result = 0;
        for (HashMap.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > requiredCount) {
                result++;
            }
        }

        return result;
    }
}