package org.cedieio.leetcode;

import java.util.ArrayList;
import java.util.List;

import org.cedieio.models.Node;

public class PreOrderTraversalTree {
	public List<Integer> preorder(Node root) {
		List<Integer> returnVal = new ArrayList<>();
		if (root == null) {
			return returnVal;
		}
		returnVal.add(root.val);

		if (root.children != null && !root.children.isEmpty()) {
			for (Node child : root.children) {
				returnVal.addAll(preorder(child));
			}
		}

		return returnVal;
	}
}
