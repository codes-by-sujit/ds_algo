package leetCode.binarytree;

import util.tree.TreeNode;

public class _226_InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        return invertTree(root);
    }

    private void invert(TreeNode root){
        if(root==null)
            return;
        invert(root.left);
        invert(root.right);
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
    }
}
