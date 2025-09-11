package leetCode.binarytree;

import util.tree.TreeNode;

public class _114_Flatten_BT {
    TreeNode prev=null;
    public void flatten(TreeNode root) {
        flat(root);
    }

    private void flat(TreeNode root){
        if(root==null)
            return;
        flat(root.right);
        flat(root.left);
        root.right=prev;
        root.left=null;
        prev=root;
    }
}
