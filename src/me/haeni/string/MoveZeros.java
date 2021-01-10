package me.haeni.string;

/*
package me.haeni.string;

public class MoveZeros {
    public void moveZeros(int[] nums) {

    }
}
 */

import java.util.Arrays;

public class MoveZeros {
    int[] nums = {0, 3, 2, 0, 8, 5};
    int index = 0;

    public void moveZeros(int[] nums) {

        // 0이 아닌값들 부터 nums에 순서대로 담는다.
        for(int i = 0;i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // 0이 아닌 애들이 담긴 이후부터 nums의 마지막 index까지 0으로 채워준다.
        while (index < nums.length){
            nums[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        MoveZeros mz = new MoveZeros();
        mz.moveZeros(mz.nums);
        System.out.println(Arrays.toString(mz.nums));
    }
}
