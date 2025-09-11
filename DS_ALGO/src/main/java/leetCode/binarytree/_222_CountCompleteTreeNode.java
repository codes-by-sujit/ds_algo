package leetCode.binarytree;

import util.tree.TreeNode;

public class _222_CountCompleteTreeNode {
    public int countNodes(TreeNode root) {
        int leftDepth=left_depth(root);
        int rightDepth=right_depth(root);
        if(leftDepth==rightDepth)
            return (int)Math.pow(2,leftDepth)-1;
        else
            return 1+countNodes(root.left)+countNodes(root.right);
    }

    private int left_depth(TreeNode root){
        TreeNode temp=root;
        int depth=0;
        while(temp!=null){
            depth++;
            temp=temp.left;
        }
        return depth;
    }

    private int right_depth(TreeNode root){
        TreeNode temp=root;
        int depth=0;
        while(temp!=null){
            depth++;
            temp=temp.right;
        }
        return depth;
    }
}
