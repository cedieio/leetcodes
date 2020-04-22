package org.cedieio.leetcode;

import java.util.Stack;

public class ReveresingInteger {
    public int reverse(int x) {
        String val = Integer.toString(x);
        if(x < 0) {
        	val = val.substring(1);
        }
        Stack<Character> pipeline= new Stack<Character>();
        String returnValue = "";
        for(char c : val.toCharArray()) {
        	pipeline.push(c);
        }
        
        while(!pipeline.isEmpty()) {
        	returnValue += pipeline.pop();
        }
        try {
        	int returnInt = x > 0 ? Integer.parseInt(returnValue) : Integer.parseInt(returnValue) * -1;
        	return returnInt;
        }catch(NumberFormatException e) {
        	return 0;
        }
        
        
    }
}
