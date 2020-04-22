package org.cedieio.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchCountNegativeNumbersTest {

	private BinarySearchCountNegativeNumbers countNegativeNumbers = new BinarySearchCountNegativeNumbers();
	
	@Test
	public void shouldCountProperly() {
		int[][] testData = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
		Assertions.assertEquals(8, countNegativeNumbers.countNegatives(testData));
	}
}
