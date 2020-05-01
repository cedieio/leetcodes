package org.cedieio.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchPerfectSquareTest {

	private BinarySearchPerfectSquare perfSquare = new BinarySearchPerfectSquare();
	
	@Test
	public void SixteenShouldBeValid() {
		Assertions.assertTrue(perfSquare.isPerfectSquare(16));

	}
	
	@Test
	public void EighThousandShouldBeValid() {
		Assertions.assertTrue(perfSquare.isPerfectSquare(808201));

	}
	
		
}
