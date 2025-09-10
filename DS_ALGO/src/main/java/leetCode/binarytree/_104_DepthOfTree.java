package leetCode.binarytree;
import org.junit.jupiter.api.Test;
import util.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class _104_DepthOfTree {
    public int maxDepth(TreeNode root) {
        int level=0;
        if(root==null)
            return level;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            level++;
        }
        return level;
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
        System.out.println(this.maxDepth(t));
    }
}
