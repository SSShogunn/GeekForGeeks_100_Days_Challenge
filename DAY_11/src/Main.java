import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution {
    public int[][] overlappedInterval(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> result = new ArrayList<>();
        int[] currentInterval = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= currentInterval[1]) {

                currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
            } else {

                result.add(currentInterval);
                currentInterval = intervals[i];
            }
        }
        result.add(currentInterval);

        int[][] mergedIntervals = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            mergedIntervals[i] = result.get(i);
        }

        return mergedIntervals;
    }
}