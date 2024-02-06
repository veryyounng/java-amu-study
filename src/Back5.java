import java.util.Arrays;
public class Back5 {
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
        int[] answer = {};
        answer = solution(num_list);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
        public static int[] solution(int[] num_list) {
            int[] answer = {};
            Arrays.sort(num_list);
            answer = Arrays.copyOfRange(num_list,5,num_list.length);
            return answer;
        }
}
