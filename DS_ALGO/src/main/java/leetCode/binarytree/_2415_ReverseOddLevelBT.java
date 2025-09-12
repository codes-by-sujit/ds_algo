package leetCode.binarytree;

import org.junit.jupiter.api.Test;
import util.tree.TreeNode;

public class _2415_ReverseOddLevelBT {
    public TreeNode reverseOddLevels(TreeNode root) {
        invert(root.left,root.right,1);
        return root;
    }

    private void invert(TreeNode left,TreeNode right, int level){
        if(left==null || right==null)
            return;

        if(level%2==1){
            int temp=left.val;
            left.val=right.val;
            right.val=temp;
        }
        invert(left.left,right.right,level+1);
        invert(left.right,right.left,level+1);
    }

    @Test
    public void tc1(){
        TreeNode t=new TreeNode(2,
                new TreeNode(3,
                        new TreeNode(8),
                        new TreeNode(13)),
                new TreeNode(5,
                        new TreeNode(21),
                        new TreeNode(34)
                )
        );
        System.out.println(this.reverseOddLevels(t));
    }
}
