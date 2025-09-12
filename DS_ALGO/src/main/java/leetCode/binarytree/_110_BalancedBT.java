package leetCode.binarytree;

import util.tree.TreeNode;

public class _110_BalancedBT {
    public boolean isBalanced(TreeNode root) {
        int d=depth(root);
        return d>0;
    }

    private int depth(TreeNode root) {
        if(root==null)
            return 0;
        int l=depth(root.left);
        int r=depth(root.right);
        if(l==-1 || r==-1)
            return -1;
        if(Math.abs(l-r)>1)
            return -1;
        return Math.max(l,r)+1;
    }
}
