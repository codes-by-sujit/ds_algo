package revision._12_sep;

import util.tree.TreeNode;

import java.util.Stack;

public class _129_SumRootToLeafBT {
    int sum=0;
    public int sumNumbers(TreeNode root) {
        if (root==null)
            return 0;
        Stack<TreeNode> nodes=new Stack<>();
        Stack<Integer> nums=new Stack<>();
        nodes.push(root);
        nums.push(root.val);
        while(!nodes.isEmpty()){
            TreeNode curr=nodes.pop();
            Integer s=nums.pop();
            if(curr.left==null && curr.right==null){
                sum+=s;
            }
            if(curr.left!=null){
                nodes.push(curr.left);
                nums.push(s*10+curr.left.val);
            }
            if(curr.right!=null){
                nodes.push(curr.right);
                nums.push(s*10+curr.right.val);
            }
        }
        return sum;
    }
}
