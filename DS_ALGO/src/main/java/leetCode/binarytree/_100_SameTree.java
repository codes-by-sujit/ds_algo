package leetCode.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import util.tree.TreeNode;

public class _100_SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isIdentical(p,q);
    }

    private boolean isIdentical(TreeNode p, TreeNode q){
        if(p==null && q==null)
            return true;
        if(p==null || q==null)
            return false;
        return p.val==q.val && isIdentical(p.left,q.left) && isIdentical(p.right,q.right);
    }

    @Test
    public void tc1(){
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        Assertions.assertTrue(isIdentical(p,q));
    }

    @Test
    public void tc2(){
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, null, new TreeNode(3));
        Assertions.assertFalse(isIdentical(p,q));
    }
}
