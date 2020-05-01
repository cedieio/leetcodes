package org.cedieio.leetcode;

import java.util.ArrayList;
import java.util.List;

import org.cedieio.models.Node;

/**
 * 
 * @author Cedric
 *
 * Leetcode URL: https://leetcode.com/problems/n-ary-tree-postorder-traversal/
 */
public class TreePostOrderTraversal {

	class Solution {
	    public List<Integer> postorder(Node root) {       
	        List<Integer> treeList = new ArrayList<>();
	        if(root == null){
	            return treeList;
	        }
	        if(root.children != null && !root.children.isEmpty()){
	            for(Node child : root.children){
	                treeList.addAll(postorder(child));
	            }
	        }
	        
	        treeList.add(root.val);
	        return treeList;
	    }
	}
}
