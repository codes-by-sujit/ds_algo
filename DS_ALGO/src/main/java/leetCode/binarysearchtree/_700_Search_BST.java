package leetCode.binarysearchtree;

import util.tree.TreeNode;

public class _700_Search_BST {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode result=null;
        if(root==null)
            return result;
        return search(root,val);
    }

    private TreeNode search(TreeNode root, int val){
        if(root==null)
            return null;
        if(root.val==val)
            return root;
        if(root.val>val)
            return search(root.left,val);
        else
            return search(root.right,val);
    }
}
