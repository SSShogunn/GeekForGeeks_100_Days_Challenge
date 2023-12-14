import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class Solution
{
    static int findLongestConseqSubseq(int arr[], int N)
    {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int longestLength = 0;

        for (int num : arr) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }
                longestLength = Math.max(longestLength, currentLength);
            }
        }

        return longestLength;
    }
}