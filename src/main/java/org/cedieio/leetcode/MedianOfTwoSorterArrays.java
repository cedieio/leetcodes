package org.cedieio.leetcode;

public class MedianOfTwoSorterArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] wholeArray = new int[nums1.length + nums2.length];
		wholeArray = merge(nums1, nums2);
		for (int i : wholeArray) {
			System.out.println(i);
		}

		int mid = wholeArray.length / 2;
		if (wholeArray.length % 2 == 0) {
			return (wholeArray[mid -1 ] + wholeArray[mid]) / 2.0;
		} else {
			return new Double(wholeArray[mid]);
		}

	}

	public int[] merge(int[] nums1, int[] nums2) {

		int nums1Length = nums1.length;
		int nums2Length = nums2.length;

		int[] merged = new int[nums1Length + nums2Length];

		int nums1Position, nums2Position, mergedPosition;
		nums1Position = nums2Position = mergedPosition = 0;

		while (nums1Position < nums1Length && nums2Position < nums2Length) {
			if (nums1[nums1Position] < nums2[nums2Position]) {
				merged[mergedPosition++] = nums1[nums1Position++];
			} else {
				merged[mergedPosition++] = nums2[nums2Position++];
			}
		}

		while (nums1Position < nums1Length) {
			merged[mergedPosition++] = nums1[nums1Position++];
		}

		while (nums2Position < nums2Length) {
			merged[mergedPosition++] = nums2[nums2Position++];
		}

		return merged;
	}

}
