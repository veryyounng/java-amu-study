import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            System.out.println(Solution(n));
        }
    }
    public static int Solution(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++){
            if(i-1 >= 0) dp[i] += dp[i-1];
            if(i-2 >= 0) dp[i] += dp[i-2];
            if(i-3 >= 0) dp[i] += dp[i-3];
        }
        return dp[n];
    }
}
