package org.cedieio.leetcode;

public class BinarySearchPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if(num == 1){
            return true;
        }
        long left = 1;
        long right = num /2;
        while(left <= right){
            long mid = left + (right - left ) /2;
            long squareVal = mid * mid; 
            System.out.println(squareVal);
            System.out.println(num);
            if(squareVal == num){
                return true;
            }else if(squareVal < num){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return false;
    }
}
