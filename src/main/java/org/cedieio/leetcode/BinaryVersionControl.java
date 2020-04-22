package org.cedieio.leetcode;

public class BinaryVersionControl {

	/*
	 * [1,2,3,4,5,6,7,8,9,10]
	 * [f,f,f,f,f,f,t,t,t,t]
	 * answer is 7
	 */
    public int firstBadVersion(int n) {
        int left = 0;
        int right = n;
        int returnValue = 0;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(isBadVersion(mid)){
                returnValue = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return returnValue;
        
    }
    
    
    private boolean isBadVersion(int n) {
    	return true;
    }
}
