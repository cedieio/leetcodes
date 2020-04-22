package org.cedieio.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class LongestPalindromeTest {

	private LongestPalindrome longestPalindrome = new LongestPalindrome();

	
	@Test
	public void testMedianOfTwoSortedArrays() {
		String test1 = "sracecarbsda213";
		assertEquals("racecar", longestPalindrome.longestPalindrome(test1));
	}
}
