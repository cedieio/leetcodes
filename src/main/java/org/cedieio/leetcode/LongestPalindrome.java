package org.cedieio.leetcode;

public class LongestPalindrome {

    public String longestPalindrome(String s) {
        if(s.length() < 1 || s == null){
            return "";
        }
    	int startSubstring = 0;
    	int endSubstring = 0;
    	for (int i = 0; i < s.length(); i++) {
    		int evenLength = isPalindrome(s, i, i);
    		int oddLength = isPalindrome(s, i, i + 1);
    		int longerLength = Math.max(evenLength, oddLength);
    		if(longerLength > endSubstring - startSubstring) {
    			startSubstring = i - ((longerLength -1) / 2);
    			endSubstring = i + (longerLength/2);
    		}
    	}
    	
    	return s.substring(startSubstring, endSubstring + 1);
    	
	}
	
	private static int isPalindrome(String s, int left, int right) {
		if (s == null || left > right) {
			return 0;
		}
		while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
    	return right - left - 1;
	}
}
