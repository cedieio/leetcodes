package org.cedieio.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchPerfectSquareTwoTest {
	private BinarySearchPerfectSquareTwo perfectSquare = new BinarySearchPerfectSquareTwo();
	
	@Test
	public void eightShouldReturnTwo() {
		Assertions.assertEquals(2, perfectSquare.mySqrt(8));
	}
	
	@Test
	public void twoShouldReturnOne() {
		Assertions.assertEquals(1, perfectSquare.mySqrt(2));
	}
}
