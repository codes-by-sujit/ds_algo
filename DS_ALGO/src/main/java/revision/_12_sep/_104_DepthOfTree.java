package revision._12_sep;

import org.junit.jupiter.api.Test;
import util.tree.TreeNode;

public class _104_DepthOfTree {
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        int l=maxDepth(root.left);
        int r=maxDepth(root.right);
        return Math.max(l,r)+1;
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
