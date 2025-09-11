package leetCode.binarytree;

import util.tree.TreeNode;

import java.util.Stack;

public class _112_PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        Stack<TreeNode> paths=new Stack<>();
        Stack<Integer> sums=new Stack<>();
        if(root==null)
            return false;
        paths.push(root);
        sums.push(root.val);
        while(!paths.isEmpty()){
            TreeNode curr=paths.pop();
            Integer sum=sums.pop();
            if(sum==targetSum && curr.left==null && curr.right==null)
                return true;
            if(curr.left!=null){
                paths.push(curr.left);
                sums.push(sum+curr.left.val);
            }
            if(curr.right!=null){
                paths.push(curr.right);
                sums.push(sum+curr.right.val);
            }
        }
        return false;
    }
}
