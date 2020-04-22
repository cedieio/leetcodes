package org.cedieio.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReveresingIntegerTest {

	private ReveresingInteger reverse = new ReveresingInteger();
	
	@Test
	public void reverseNegative() {
		assertEquals(-321, reverse.reverse(-123));
	}
	
	@Test
	public void reversePositive() {
		assertEquals(321, reverse.reverse(123));
	}
	
	@Test
	public void reverseRespondsWithZeroWithLongNumbers() {
		assertEquals(0, reverse.reverse(1534236469));
	}
}
