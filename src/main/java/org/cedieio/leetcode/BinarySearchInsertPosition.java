package org.cedieio.leetcode;

public class BinarySearchInsertPosition {

	/*
	 * input [1,2,4,6,7], 3
	 * output 2
	 */
    public int searchInsert(int[] nums, int target) {
    	
    	int low = 0;
    	int high = nums.length;
      	int position = -1;
    	if(nums[0] > target) {
    		return 0;
    	}else if(nums[nums.length - 1] < target) {
    		return nums.length;
    	}
    	while(low <= high) {
    		int mid = low + (high - low) / 2;
    		if(nums[mid] == target) {
    			return mid;
    		}else if(nums[mid] < target) {
    			position = mid + 1;
    			low = mid + 1;
    		}else if(nums[mid] > target) {
    			position = mid;
    			high = mid - 1;
    		}
    	}
    	return position;
    }
}
