
// 문제 : https://leetcode.com/problems/unique-email-addresses/

import java.util.HashSet;
import java.util.Set;

public class T11_UniqueEmailAddress {
    public static void main(String[] args) {
        String[] emails =
                {"test.email+alex@leetcode.com",
                        "test.e.+mail+bob.cathy@leetcode.com",
                        "teste.+mail+bob.cathy@leetcode.com",
                        "testemail+david@lee.tcode.com"};

        T11_UniqueEmailAddress t11 = new T11_UniqueEmailAddress();
        System.out.println(t11.numUniqueEmails(emails));
    }
    public int numUniqueEmails(String[] emails) {
        String [] temps= null;

        // 중복값 제거하고 담을 그릇 : Set
        Set<String> set = new HashSet<>();

        for(String s:emails) {
            // @로 분리하기
            temps = s.split("@");
            String local = temps[0];
            String domain = temps[1];

            // locals에 . 없애기
            local = local.replaceAll("\\.","");

            // locals에서 + 뒤는 자르기
            if(local.contains("+")) {
                local = local.substring(0,local.indexOf('+'));
            }

            // local과 domain 합치기
            s = local + "@" + domain;
            System.out.println(s);

            // set에 s 담기
            set.add(s);
        }
        // set에 담겨진 갯수 반환하기
        return set.size();
    }
}
