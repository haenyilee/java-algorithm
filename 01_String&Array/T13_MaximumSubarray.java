// 문제 : https://leetcode.com/problems/maximum-subarray/
// 동적계획법, 카데인 알고리즘

public class T13_MaximumSubarray {
    public static void main(String[] args){
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        T13_MaximumSubarray t13 = new T13_MaximumSubarray();
        int result = t13.maxSubArray(nums);
        System.out.println(result);
    }
    public int maxSubArray(int[] nums) {
        int newSum = nums[0];
        int max = nums[0];

        for(int i=1; i<nums.length; i++) {
            newSum = Math.max(nums[i],nums[i]+newSum);
            max = Math.max(newSum, max);
        }
        return max;
    }
}
