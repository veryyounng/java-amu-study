import java.util.HashMap;
public class Clothes {
    public static void main(String[] args) {

        String[][] clothes1 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(clothes1));

        String[][] clothes2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        System.out.println(solution(clothes2));
    }
    public static int solution(String[][] clothes){
        int answer = 1;
        //for문 써서 map안에 clothes 넣을 때 같은 종류면 +1, 아니면 0을 더한다
        //빠른 for문으로 map.keySet()을 사용하여 answer에 key를 +1하고 다 곱한다
        //answer에 -1한다
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < clothes.length; i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) +1);
        }
        for(String key: map.keySet()){
            answer *= (map.get(key) +1);
        }
        answer -= 1;
        return answer;
    }
}
