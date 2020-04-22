package org.cedieio.leetcode;

public class BinarySearchCountNegativeNumbers {
	public int countNegatives(int[][] grid) {
		if (grid == null || grid.length == 0 || grid[0].length == 0) {
			return 0;
		}
 		int negativeCount = 0;
		for (int i = 0; i < grid.length; i++) {
			int left = 0;
			int right = grid[i].length - 1;
			int negativeNumber = 0;
			while (left <= right) {
				int mid = left + (right - left) / 2;
				if (grid[i][mid] < 0) {
					right = mid - 1;
					negativeNumber = grid[i].length - mid;
				} else {					
					left = mid + 1;
				}
			}
			
			negativeCount += negativeNumber;
		}

		return negativeCount;
	}
}
