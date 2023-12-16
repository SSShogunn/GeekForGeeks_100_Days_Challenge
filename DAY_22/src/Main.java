public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution {
    static int maxProfit(int K, int N, int A[]) {
        if (N == 0 || K == 0) {
            return 0;
        }

        int[][] dp = new int[K + 1][N];

        for (int i = 1; i <= K; i++) {
            int maxDiff = -A[0];
            for (int j = 1; j < N; j++) {
                dp[i][j] = Math.max(dp[i][j - 1], A[j] + maxDiff);
                maxDiff = Math.max(maxDiff, dp[i - 1][j] - A[j]);
            }
        }

        return dp[K][N - 1];
    }
}
