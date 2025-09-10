package leetCode.binarytree;

import org.junit.jupiter.api.Test;
import util.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _102_LevelOrder_Traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)
            return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode n=q.poll();
                level.add(n.val);
                if(n.left!=null)
                    q.add(n.left);
                if(n.right!=null)
                    q.add(n.right);
            }
            ans.add(level);
        }
        return ans;
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
        System.out.println(this.levelOrder(t));
    }
}
