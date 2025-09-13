package leetCode.binarytree;

import org.junit.jupiter.api.Test;
import util.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _637_AvgOfLevelsBT {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Double> result=new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            double sum = 0.0;
            int i=0;
            for(;i<size;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
                sum+=curr.val;
            }
            result.add(sum/i);
        }
        return result;
    }

    @Test
    public void tc1(){
        TreeNode t=new TreeNode(3,
                    new TreeNode(1,
                            new TreeNode(0),
                            new TreeNode(2)
                    ),
                    new TreeNode(5,
                            new TreeNode(4),
                            new TreeNode(6)
                    )
                );
        System.out.println(this.averageOfLevels(t));
    }

}
