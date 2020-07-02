package _00_Algorithm;

import java.util.Scanner;

public class _00_01背包_未优化 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        final int N = n + 1;
        int[][] dp = new int[N][N];
        int[] v = new int[N];
        int[] w = new int[N];
        for (int i = 1; i <= n; i++) {
            v[i] = in.nextInt();
            w[i] = in.nextInt();
        }
        in.close();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= v[i]) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - v[i]] + w[i]);
                }
            }
        }
        System.out.println(dp[n][m]);
    }
}
