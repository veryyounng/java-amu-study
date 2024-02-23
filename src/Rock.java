import java.util.Scanner;

public class Rock {
    static int[] arr;
    public int solution(int n){
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i <= n+1; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n+1];
    }
    public static void main(String[] args) {
        Rock T = new Rock();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr= new int[n+2];
        System.out.println(T.solution(n));
    }
}
