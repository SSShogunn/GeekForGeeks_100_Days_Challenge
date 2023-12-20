import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        if (m > n) {
            return -1;
        }

        Collections.sort(a);

        long minDiff = Long.MAX_VALUE;

        for (int i = 0; i + m - 1 < n; i++) {
            long currentDiff = a.get(i + m - 1) - a.get(i);
            minDiff = Math.min(minDiff, currentDiff);
        }

        return minDiff;
    }
}