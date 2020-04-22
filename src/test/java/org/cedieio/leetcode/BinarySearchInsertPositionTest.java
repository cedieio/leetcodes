package org.cedieio.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BinarySearchInsertPositionTest {

	BinarySearchInsertPosition insertPos = new BinarySearchInsertPosition();
	
	@Test
	public void shouldSearchWhenTargetIsGreater() {
		int[] val = {1,3,5,6};
		assertEquals(4, insertPos.searchInsert(val, 7));
	}
	
	@Test
	public void shouldSearch() {
		int[] val = {1,3,5,6};
		assertEquals(2, insertPos.searchInsert(val, 5));
	}
	
	@Test
	public void shouldSearchWithOneInput() {
		int[] val = {1,3};
		assertEquals(0, insertPos.searchInsert(val, 1));
	}
}
