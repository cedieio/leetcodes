package org.cedieio.leetcode;

public class BinarySearchPerfectSquareTwo {
    public int mySqrt(int x) {
        if( x == 1){
            return 1;
        }
        int left = 0;
        int right =  x;
        while(left + 1< right){
            int mid = left + (right - left ) /2;
            int squareVal = mid * mid; 
            if(squareVal ==  x){
                return mid;
            }else if(squareVal <  x){
                left = mid;
            }else{
                right = mid;
            }
        }
        
        if(right * right == x){
            return right;
        }
        
        return left;    
    }
}
