package leetCode.binarytree;

import util.tree.TreeNode;

import java.util.*;

public class _103_BTZigZag {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result= new ArrayList<>();
        if(root==null)
            return result;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean leftToRight=true;
        while(!q.isEmpty()){
            int size=q.size();
            Integer[] levelNodes=new Integer[size];
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(leftToRight){
                    levelNodes[i]=curr.val;
                } else{
                    levelNodes[(size-1)-i]=curr.val;
                }
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            leftToRight=!leftToRight;
            result.add(Arrays.asList(levelNodes));
        }
        return result;
    }
}
