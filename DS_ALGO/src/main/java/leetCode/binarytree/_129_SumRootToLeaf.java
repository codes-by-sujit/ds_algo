package leetCode.binarytree;

import org.junit.jupiter.api.Test;
import util.tree.TreeNode;

import java.util.Stack;

public class _129_SumRootToLeaf {
    public int sumNumbers(TreeNode root) {
        Stack<Integer> numStack=new Stack<>();
        Stack<TreeNode> paths=new Stack<>();
        int sum=0;
        if(root.left==null && root.right==null)
            return root.val;
        numStack.push(root.val);
        paths.push(root);
        while(!paths.isEmpty()){
            TreeNode curr=paths.pop();
            int num=numStack.pop();
            if(curr.left==null && curr.right==null) { //Leaf node
                sum+=num;
            }
            if(curr.left!=null){
                paths.push(curr.left);
                numStack.push(num*10+curr.left.val);
            }
            if(curr.right!=null){
                paths.push(curr.right);
                numStack.push(num*10+curr.right.val);
            }
        }
        return sum;
    }



    @Test
    public void tc1(){
        TreeNode t= new TreeNode(4,
                new TreeNode(9,
                        new TreeNode(5),
                        new TreeNode(1)
                        ),
                new TreeNode(0)
                );
        System.out.println(this.sumNumbers(t));
    }
}
