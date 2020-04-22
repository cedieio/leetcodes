package org.cedieio.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MedianOfTwoSorterArraysTest {

	private MedianOfTwoSorterArrays medianOfTwoSorterArrays = new MedianOfTwoSorterArrays();

	
	@Test
	public void testMedianOfTwoSortedArrays() {
		int[] nums1 = {1,2,3};
		int[] nums2 = {4,5,6};
		
		assertEquals(3.5, medianOfTwoSorterArrays.findMedianSortedArrays(nums1, nums2));
	}
}
