package leetCode.binarysearchtree;

import util.tree.TreeNode;

public class _530_MinAbsoluteDiff {
    int min=Integer.MAX_VALUE;
    TreeNode prev= null;

    public int getMinimumDifference(TreeNode root) {
        calc(root);
        return min;
    }

    public void calc(TreeNode root){
        if(root==null)
            return;
        calc(root.left);
        if(prev!=null){
            int diff=Math.abs(root.val-prev.val);
            min=Math.min(diff,min);
        }
        prev=root;
        calc(root.right);
    }

}
