import java.util.Arrays;

public class T10_PlusOne {
    public static void main(String[] args) {
//        int[] digits = {1,2,3};
//        int[] digits = {9,9,9};
//        int[] digits = {1,9,9};
//        int[] digits = {1,4,9};
        int[] digits = {0,0,1};

        T10_PlusOne po = new T10_PlusOne();
        int[] result = po.plusOne(digits);
        System.out.println(Arrays.toString(result));
    }
    public int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        int carry = 1;

        // index<0 || carry=0일 때 탈출
        while (index >= 0 && carry > 0) {
            digits[index] = (digits[index]+1) % 10;

            // 1을 더해서 10이 될 때
            if(digits[index] == 0) {
                carry = 1;
            }
            // 1을 더해서 10 이하일 때
            else {
                carry = 0;
            }
            index--;
        }

        if(carry == 1) {
            digits = new int[digits.length+1]; // 전부 0으로 초기화
            digits[0] = 1;
        }
        return digits;
    }
}
