package leetCode.binarytree;

import util.tree.TreeNode;

public class _236_LowestCommonAncestorBT {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return find(root,p,q);
    }

    private TreeNode find(TreeNode root, TreeNode p, TreeNode q){
        if(root==null||root==p || root==q)
            return root;
        TreeNode leftSearch=find(root.left,p,q);
        TreeNode rightSearch=find(root.right,p,q);
        if(leftSearch==null)
            return rightSearch;
        else if(rightSearch==null)
            return leftSearch;
        else
            return root;
    }


}
