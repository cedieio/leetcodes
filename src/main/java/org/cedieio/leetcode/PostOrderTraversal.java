package org.cedieio.leetcode;

import java.util.ArrayList;
import java.util.List;

import org.cedieio.models.Node;

public class PostOrderTraversal {
	public List<Integer> preorder(Node root) {
		List<Integer> returnVal = new ArrayList<>();
		if (root == null) {
			return returnVal;
		}

		if (root.children != null && !root.children.isEmpty()) {
			for (Node child : root.children) {
				returnVal.addAll(preorder(child));
			}
		}

		returnVal.add(root.val);
		return returnVal;
	}
}