package com.dsa.arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int []height ={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
    public static int trap(int []height){
        int res = 0;
        int left_max = 0;
        int right_max = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            left_max = Math.max(left_max, height[i]);
            right_max = Math.max(right_max, height[j]);
            if (left_max < right_max) {
                res += left_max - height[i];
                i++;
            } else {
                res += right_max - height[j];
                j--;
            }
        }
        return res;
    }
}
