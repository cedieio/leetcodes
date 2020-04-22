package org.cedieio.leetcode;

public class MinimumSubArraySum {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums == null || nums.length < 1){
            return 0;
        }
        int left = 0;
        int maxVal = Integer.MAX_VALUE;
        int sumVal = 0;
        for(int i = 0; i < nums.length; i++){
            sumVal += nums[i];
            while(sumVal >= s){
                maxVal = Math.min(maxVal, i + 1 - left);
                sumVal -= nums[left];
                left++;                
            }
        }
        
        return (maxVal != Integer.MAX_VALUE) ? maxVal : 0;
        
    }
}
