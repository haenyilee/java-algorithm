// 문제 링크 : https://leetcode.com/problems/longest-substring-with-at-most-two-distinct-characters/

import java.util.HashMap;
import java.util.Map;

public class T12_LongestSubMostTwoDist {
    public static void main(String[] args) {
//        String s = "eceba";
        String s = "ccaabbb";
        T12_LongestSubMostTwoDist t12 = new T12_LongestSubMostTwoDist();
        int result = t12.lengthOfLongestSubMostTwoDist(s);
        System.out.println(result);
    }
    public int lengthOfLongestSubMostTwoDist(String s) {
        // 1
        int start = 0, end = 0;
        int length = 0; // 구간 길이
        int counter = 0; // 구간 내 문자의 갯수
        Map<Character,Integer> map = new HashMap<>(); // 구간 내 저장된 문자

        // 2
        while(end < s.length()) {
            char endChar = s.charAt(end); // end포인터가 가르키는 문자
            // start~end구간 내 문자 현황을 Map에 저장
            map.put(endChar,map.getOrDefault(endChar,0)+1);

            // map에 새로운 문자가 저장되면 구간내 문자의 갯수 증가시키기
            if(map.get(endChar)==1) counter++;

            // end 포인터 이동시키기
            end++;

            // 3 : 구간 내 문자가 2개 초과하는 경우 start 포인터 조정
            while(counter > 2) {
                char startChar = s.charAt(start);
                map.put(startChar,map.get(startChar)-1); // map에서 문자 하나 빼기
                if(map.get(startChar)==0) counter--;
                start++;
            }
            // 최대 구간 길이
            length = Math.max(length,end-start);

            System.out.println("end:"+end);
            System.out.println("start:"+start);
            System.out.println("length:"+length);
            System.out.println("========================");
        }
        return length;
    }
}
