package String_Array;

/*
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
    }

}
 */

import java.util.Arrays;

public class TwoSum_2for {

    public int[] twoSum(int[] nums, int target) {
        int[] result = {0,0};
        // 배열의 각 요소들의 합 중 target이 되는 것을 찾는다.
        for(int i  = 0; i< nums.length - 1; i++){
            for(int j = 1; j<nums.length; j++){
                while (nums[i] + nums[j] == target) {
                    // 두 요소의 index를 알아낸다.
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // 숫자 배열이 주어진다
        int[] nums = {2, 8, 10, 21};

        // target이 주어진다.
        int target = 10;

        TwoSum_2for ts = new TwoSum_2for();
        int[] result = ts.twoSum(nums, target);
        System.out.println(Arrays.toString(result));

    }
}
