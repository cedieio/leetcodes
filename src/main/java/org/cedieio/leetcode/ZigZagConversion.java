package org.cedieio.leetcode;

import java.util.HashMap;

public class ZigZagConversion {

	public String convert(String s, int numRows) {		
		HashMap<Integer, String> rowStrings = new HashMap<>();
		String returnVal = "";
		int strCounter = 0;
		boolean increment = true;
		for(char c : s.toCharArray()) {
			if(strCounter == numRows - 1) {
				increment = false;
			}else if(strCounter == 0) {
				increment = true;
			}
			
			rowStrings.put(strCounter, rowStrings.getOrDefault(strCounter, "") + c);
			
			if(increment) {
				strCounter++;
			}else {
				strCounter--;
			}
		}
		
		for(String val : rowStrings.values()) {
			returnVal += val;
		}
		return returnVal;
	}
}
