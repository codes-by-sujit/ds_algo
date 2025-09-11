package leetCode.binarytree;

import org.junit.jupiter.api.Test;
import util.tree.TreeNode;

public class _124_MaxPathSum {
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        //If there is only 1 element then return it's val
        if(root.left==null && root.right==null){
            return root.val;
        }
        maxSum(root);
        return max;
    }

    private int maxSum(TreeNode root){
        if(root==null){
            return 0;
        }
        //Find the max sum of left side nodes.
        int left = Math.max(0, maxSum(root.left));

        //Find the max sum of the right side nodes.
        int right= Math.max(0, maxSum(root.right));

        //Compare the current path sum is greater than the max value.
        max=Math.max(max,root.val+left+right);

        //don't compare with Max otherwise max value will be returned from
        // all the nodes which are less than max.
        return Math.max(left,right)+root.val;
    }


    @Test
    public void tc1(){
        TreeNode t=new TreeNode(-10,
                    new TreeNode(9),
                    new TreeNode(20,
                            new TreeNode(15),
                            new TreeNode(7))
                );
        System.out.println(this.maxPathSum(t));
    }
}
