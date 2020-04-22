package org.cedieio.leetcode;

import java.util.HashMap;

public class TwoSum {
	static int[] inputs = {2,7,11,15};
	
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> values = new HashMap<>();
        int[] returnVal = new int[2];
        for(int i = 0; i < nums.length; i++){
            
            if(values.containsKey(nums[i])){
                returnVal[0] = values.get(nums[i]);
                returnVal[1] = i;
            }else{
                values.put(target - nums[i], i);
            }
        }
        
        return returnVal;
    }
    
    public static void main( String[] args ) {
    	twoSum(inputs, 9);    
    }
    
    
    
}
