package com.company;

/**
 * Created by ridita on 4/4/18.
 */
public class ArrayFront9 {

    public boolean arrayFront9(int[] nums) {

        for(int i = 0; i < nums.length; i++){
            if(nums.length < 1){
                return false;
            }
            else if(i < 4 && nums[i] == 9){
                return true;
            }
        }

        return false;

    }

}
