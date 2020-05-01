package org.cedieio.leetcode;

import org.cedieio.models.TreeNode;

public class TreePathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        return getPathSum(root, sum);
    }
    
    private boolean getPathSum(TreeNode node, int sum){
        if(node == null){
            return false;
        }
        if(sum == node.val && node.right == null && node.left == null){
            return true;
        }
        
        return getPathSum(node.left, sum - node.val) 
            || getPathSum(node.right, sum - node.val);
    }
}
