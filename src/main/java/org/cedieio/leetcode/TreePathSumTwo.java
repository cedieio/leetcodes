package org.cedieio.leetcode;

import java.util.ArrayList;
import java.util.List;

import org.cedieio.models.TreeNode;

public class TreePathSumTwo {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
    	List<List<Integer>> returnList = new ArrayList<>();
    	List<Integer> path = new ArrayList<>();
    	dfs(root, returnList, path, sum);
    	
    	return returnList;
    	
    }
   
    private void dfs(TreeNode node, List<List<Integer>> returnList, List<Integer> path, int sum) {
    	if(node == null) {
    		return;
    	}
    	path.add(node.val);
    	// we've made it to the end of a certain path and the sum is equal to a path.
    	if(sum == node.val && node.left == null && node.right == null) {
    		// create new object to insert to array list
    		returnList.add(new ArrayList<Integer>(path));
    	}else {
    		dfs(node.right, returnList, path, sum - node.val);
    		dfs(node.left, returnList, path, sum - node.val);
    	}
    	
    	path.remove(path.size() - 1);
    }
}
