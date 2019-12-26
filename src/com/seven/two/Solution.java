package com.seven.two;

public class Solution {
    public static void rotate(int[] nums,int k){
        if(nums==null || nums.length==0) System.out.println("参数异常");
       /* int len=nums.length;
        for (int i = 0; i <k ; i++) {
            int tmp=nums[len-1];
            for(int j=len-1;j>0;j--){
                nums[j]=nums[j-1];
            }
            nums[0]=tmp;
        }*/
        /*for (int i = 0; i <k ; i++) {
            int tmp=nums[nums.length-1];
            for (int j = 0; j <nums.length; j++) {
                int tmp2=nums[j];
                nums[j]=tmp;
                tmp=tmp2;
            }
        }*/



    }
    public static void show(int[] nums){
        for (int i = 0; i <nums.length ; i++) {
            System.out.print(nums[i]+"\t");
        }
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4,5,6,7};
        Solution.rotate(nums,3);
        Solution.show(nums);

    }
}
