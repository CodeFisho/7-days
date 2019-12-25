package com.seven.one;

/*
*
*
*
* */
public class Solution {
    public static int removeDuplicates(int nums[]){
        int target=1;
        for (int i = 0; i <nums.length-1 ; i++) {
            if(nums[i+1]!=nums[i]){
                nums[target]=nums[i+1];
                target++;
            }
        }
        return target;
    }

    public static void main(String[] args) {
        int nums[]=new int[]{0,1,1,2,3,3,4,5};
        int result=Solution.removeDuplicates(nums);
        System.out.println(result);
        for (int i = 0; i <result; i++) {
            System.out.print(i+"\t");
        }
    }

}
