package String_Array;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public static void main(String[] args) {
        String J = "aAe", S = "aAAbbbbccccDDDe";
        JewelsAndStones js = new JewelsAndStones();
        System.out.println(js.solve(J, S));
    }
    public int solve(String jew, String stone) {
        // 중복을 저장하지 않는 hashset 만들기
        Set<Character> set = new HashSet<>();

        // set에 jew와 stone를 한글자씩 담기
        for(char jewel: jew.toCharArray()) {
            set.add(jewel);
        }
        // J의 letter들이 S에 몇 개 들어있는지 검사한다.
        int count = 0;
        for(char stoneChar : stone.toCharArray()) {
            if(set.contains(stoneChar)) {
                count++;
            }
        }
        return count;
    }
}
