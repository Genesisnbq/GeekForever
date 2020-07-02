package _00_Algorithm;

import java.util.Scanner;

public class _00_01背包_优化版 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        final int N = 1010;
        int[] v = new int[N];
        int[] w = new int[N];
        int[] dp = new int[N];
        for (int i = 1; i <= n; i++) {
            v[i] = in.nextInt();
            w[i] = in.nextInt();
        }
        in.close();
        for (int i = 1; i <= n; i++) {
            for (int j = m; j >= v[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - v[i]] + w[i]);
            }
        }
        System.out.println(dp[m]);
    }
}
