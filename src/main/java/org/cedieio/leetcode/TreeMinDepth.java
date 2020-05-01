package org.cedieio.leetcode;

import org.cedieio.models.TreeNode;

public class TreeMinDepth {
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		if (root.left == null && root.right == null) {
			return 1;
		}

		if (root.left == null) {
			return maxDepth(root.right) + 1;
		}

		if (root.right == null) {
			return maxDepth(root.left) + 1;
		}

		return Math.min(maxDepth(root.right), maxDepth(root.left)) + 1;
	}
}
