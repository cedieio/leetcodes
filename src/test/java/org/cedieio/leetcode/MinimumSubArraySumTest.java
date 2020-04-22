package org.cedieio.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumSubArraySumTest {

	private MinimumSubArraySum minimumSubArray = new MinimumSubArraySum();
		
	@Test
	public void shouldCountTheCorrectMinSubArray() {
		int[] twoMinArray = {2,3,1,2,4,3};
		Assertions.assertEquals(2, minimumSubArray.minSubArrayLen(7, twoMinArray));
	}
}
