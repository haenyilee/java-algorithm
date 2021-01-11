package me.haeni.string;
/*
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
    }

}
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 11, 2, 15, 7};
        int target = 9;
        TwoSum ts = new TwoSum();
        int[] result = ts.twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }
    public int[] twoSum(int[] nums, int target) {
        // 첫번째로 받을 값을 담아 둔다.
        Map<Integer, Integer> map = new HashMap<>();

        // 결과값을 담을 것이다.
        int[] result = new int[2];

        // 배열의 크기만큼 for문을 돌린다.
        for(int i = 0; i < nums.length; i++){
            // map에 값이 있으면?
            if(map.containsKey(nums[i])){
                // 밑에서 map에 담아둔 index번호가 result에 첫번째로 담긴다.
                result[0] = map.get(nums[i]); // 1
                // 현재 i값이 result에 두번째로 담긴다.
                result[1] = i; // 3
            }
            // map에 값이 없으면?
            else {
                // map에 target에서 해당값을 뺸값과 해당 index를 담아준다
                map.put(target - nums[i], i); // (9-2 = 7, 1)
            }
        }
        return result;
    }

}