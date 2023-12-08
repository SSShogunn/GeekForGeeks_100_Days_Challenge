import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}


class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int pairsCount = 0;

        for (int num : arr) {
            int complement = k - num;

            if (frequencyMap.containsKey(complement)) {
                if (complement == num) {
                    pairsCount += frequencyMap.get(complement) - 1;
                } else {
                    pairsCount += frequencyMap.get(complement);
                }
            }
        }

        return pairsCount / 2;
    }
}
