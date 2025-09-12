package revision._12_sep;

import util.tree.TreeNode;

public class _124_BTMaxPathSum {
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        calc(root);
        return max;
    }
    public int calc(TreeNode root){
        if(root==null)
            return 0;
        int left=Math.max(0, calc(root.left));
        int right=Math.max(0,calc(root.right));
        int temp=root.val+left+right;
        max=Math.max(max,temp);
        return Math.max(left,right)+root.val;
    }
}
