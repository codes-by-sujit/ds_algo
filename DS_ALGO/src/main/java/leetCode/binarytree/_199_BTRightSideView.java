package leetCode.binarytree;

import util.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _199_BTRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> result=new ArrayList<>();
        if(root==null)
            return result;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            TreeNode lastNode=null;
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
                lastNode=curr;
            }
            result.add(lastNode.val);
        }
        return result;
    }
}
