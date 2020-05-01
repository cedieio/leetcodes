package org.cedieio.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchIn2dArrayTest {

	private BinarySearchIn2dArray binary2dSearch = new BinarySearchIn2dArray();

	@Test	
	public void binaryShouldBeAbleToSearchIn2dMatrix() {
		int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
		Assertions.assertTrue(binary2dSearch.searchMatrix(matrix, 3));
	}
}
