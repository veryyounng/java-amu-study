import java.util.Scanner;
public class Plus123 {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                int T = sc.nextInt(); // 테스트 케이스의 개수

                for (int t = 0; t < T; t++) {
                    int n = sc.nextInt(); // 정수 n

                    // dp 배열 초기화
                    int[] dp = new int[n + 1];
                    dp[0] = 1; // 0을 만드는 방법은 아무것도 선택하지 않는 것 1가지 방법

                    // 점화식: dp[i] = dp[i-1] + dp[i-2] + dp[i-3]
                    for (int i = 1; i <= n; i++) {
                        if (i - 1 >= 0) {
                            dp[i] += dp[i - 1];
                        }
                        if (i - 2 >= 0) {
                            dp[i] += dp[i - 2];
                        }
                        if (i - 3 >= 0) {
                            dp[i] += dp[i - 3];
                        }
                    }

                    System.out.println(dp[n]);
                }

                sc.close();
            }
        }

