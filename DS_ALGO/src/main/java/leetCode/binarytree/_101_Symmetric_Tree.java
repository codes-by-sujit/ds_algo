package leetCode.binarytree;

import util.tree.TreeNode;

public class _101_Symmetric_Tree {
    public boolean isSymmetric(TreeNode root) {
        return  isSym(root.left,root.right);
    }

    private boolean isSym(TreeNode p, TreeNode q){
        if(p==null || q==null){
            return p==q;
        }
        return p.val==q.val &&
                isSym(p.left,q.right) &&
                isSym(p.right,q.left);
    }
}
