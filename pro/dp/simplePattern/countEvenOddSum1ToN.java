package pro.dp.simplePattern;
import java.util.*;

public class countEvenOddSum1ToN {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int n = scanner.nextInt();
        // int[] a = new int[n + 1];

        // for (int i = 1; i <= n; i++) {
        //     a[i] = scanner.nextInt();
        // }

        int n = 5;
        //here taking 0 as dp array starts from index 1
        int[] a = new int[]{0,2,3,5,8,10};
    
        int[][] dp = new int[100005][3];
    
        if (a[1] % 2 == 0) {
            dp[1][2] = 1;
        } else {
            dp[1][1] = 1;
        }
    
        int i = 2;
        while (i <= n) {
            if (a[i] % 2 == 0) {
                dp[i][2] = dp[i - 1][2] + dp[i - 2][2];
                dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
            } else {
                dp[i][2] = dp[i - 1][1] + dp[i - 2][1];
                dp[i][1] = dp[i - 1][2] + dp[i - 2][2];
            }
            i++;
        }
    
        System.out.println(dp[n][1] + " " + dp[n][2]);
    } 
}
