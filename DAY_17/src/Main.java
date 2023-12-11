import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution {
    static boolean findsum(int[] arr, int n) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == 0 || set.contains(sum) || arr[i] == 0) {
                return true;
            }

            set.add(sum);
        }

        return false;
    }
}
