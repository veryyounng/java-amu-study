import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Dong0 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();

        int[] coin = new int[N];
        int count = 0;

        for(int i = 0; i < N; i++){
            coin[i] = sc.nextInt();
        }

        for (int i = N-1; i >= 0; i--){
            if(coin[i] <= k){
                count += (k/coin[i]);
                k = k % coin[i];
            }
        }
        System.out.println(count);
    }
}
