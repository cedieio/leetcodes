package org.cedieio.leetcode;

import java.util.HashMap;

public class LongestWordWithoutRepitition {
	
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charsMap = new HashMap<>();
        int max = 0;
        int charAtCount = 0;
        for(int i = 0; i < s.length(); i++){
            if(charsMap.containsKey(s.charAt(i))){
                charAtCount = Math.max(charsMap.get(s.charAt(i)), charAtCount + 1);
            }
            charsMap.put(s.charAt(i), i);
            max = Math.max(max, i - charAtCount + 1);
        }
        
        return max;
    }
    
    public static void main(String args[]) {
    	System.out.println(lengthOfLongestSubstring(" "));
    }
}
