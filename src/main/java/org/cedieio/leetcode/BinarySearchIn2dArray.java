package org.cedieio.leetcode;

public class BinarySearchIn2dArray {
	
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length < 1) return false;
        
        int left = 0;
        int right = ( matrix.length * matrix[0].length ) - 1;
        
        while (left <= right){
            int mid = left + (right - left) / 2;
            int x = mid / (matrix[0].length);
            int y = mid % (matrix[0].length);
            if(matrix[x][y] == target){
                return true;
            }else if(matrix[x][y] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        
        
        }
        return false;
    }
}
