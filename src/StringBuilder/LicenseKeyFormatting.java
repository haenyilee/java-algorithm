package StringBuilder;

import java.util.Locale;

// StringBuilder
public class LicenseKeyFormatting {
    public static void main(String[] args) {
        String str = "8F3Z-2e-9-wfj";
        int k = 4;
        LicenseKeyFormatting lkf = new LicenseKeyFormatting();
        System.out.println(lkf.licenseKeyFormatting(str,k));
    }
    public String licenseKeyFormatting(String S, int K) {

        // 하이픈제거
        String newStr = S.replace("-","");

        // 대문자 변환
        newStr = newStr.toUpperCase();

        // StringBuilder 에 각 char를 넣는다.
        StringBuilder sb = new StringBuilder();


        for(int i = 0; i < newStr.length(); i++) {
            sb.append(newStr.charAt(i));
        }
        // 뒤에서부터 4자리씩 끊는다.
        int len = sb.toString().length();
        for(int i = K; i < len ; i = i + K) {
            sb.insert(len - i,'-');
            System.out.println(len-i);
        }
        return sb.toString();
    }
}
