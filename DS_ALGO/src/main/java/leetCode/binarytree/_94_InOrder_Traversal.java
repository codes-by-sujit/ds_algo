package leetCode.binarytree;

import org.junit.jupiter.api.Test;
import util.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _94_InOrder_Traversal {
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result=new ArrayList<>();
        inOrder(root,result);
        //System.out.println(result);
        return result;
    }

    private void inOrder(TreeNode node, List<Integer> result){
        if(node==null)
            return;

        inOrder(node.left,result);
        result.add(node.val);
        inOrder(node.right,result);
    }

    @Test
    public void tc1(){
        TreeNode t=new TreeNode(1,
                null,
                new TreeNode(2,
                        new TreeNode(3),
                        null)
        );
        this.inorderTraversal(t);
    }

    @Test
    public void tc2(){
        TreeNode t=new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5,
                                new TreeNode(6),
                                new TreeNode(7))
                ),
                new TreeNode(3,
                        null,
                        new TreeNode(8,new TreeNode(9),null))
        );
        System.out.println(this.inorderTraversal(t));
    }
}
