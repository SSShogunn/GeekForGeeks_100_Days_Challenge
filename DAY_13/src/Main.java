import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class Solution {
    ArrayList<ArrayList<Integer>> stockBuySell(int A[], int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (n <= 1) {
            return result;
        }
        int i = 0;
        while (i < n - 1) {
            while (i < n - 1 && A[i] >= A[i + 1]) {
                i++;
            }

            if (i == n - 1) {
                break;
            }

            int buy = i++;

            while (i < n && A[i] >= A[i - 1]) {
                i++;
            }

            int sell = i - 1;

            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(buy);
            pair.add(sell);
            result.add(pair);
        }

        return result;
    }
}