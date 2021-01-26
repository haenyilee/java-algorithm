
// 문제 : https://leetcode.com/problems/unique-email-addresses/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class T11_UniqueEmailAddress {
    public static void main(String[] args) {
        String[] emails =
                {"test.email+alex@leetcode.com",
                        "test.e.+mail+bob.cathy@leetcode.com",
                        "teste.+mail+bob.cathy@leetcode.com",
                        "testemail+david@lee.tcode.com"};

        T11_UniqueEmailAddress u = new T11_UniqueEmailAddress();
        int result = u.numUniqueEmails(emails);
        System.out.println(result);
    }
    public int numUniqueEmails(String[] emails) {
        int result = 0;
        Set<String> set = new HashSet<>();
        // local 자르기
        for(String e : emails) {
            String[] str = e.split("@");
            String locals = str[0];

            // local에 . 있는지 확인해서 . 없애기
            if(locals.contains(".")){
                locals = locals.replaceAll("\\.","");
            }
            // local에 + 있는지 확인해서 뒷 글자 없애기
            if(locals.contains("+")) {
                int target = locals.indexOf("+");
                locals = locals.substring(0,target);
            }
            set.add(locals + "@" + str[1]);
        }


        // local + domain 다 합쳐서 비중복 갯수 세기
        return set.size();
    }
}
