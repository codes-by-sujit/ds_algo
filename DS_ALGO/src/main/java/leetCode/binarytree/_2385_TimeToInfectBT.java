package leetCode.binarytree;

import org.junit.jupiter.api.Test;
import util.tree.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class _2385_TimeToInfectBT {
    public int amountOfTime(TreeNode root, int start) {
        Map<TreeNode,TreeNode> parentMap = new HashMap<>();
        TreeNode target=getInfectedNadPrepareMap(root,start,parentMap);
        return maxDistanceFromInf(target, parentMap);
    }

    private int maxDistanceFromInf(TreeNode root,Map<TreeNode,TreeNode> parentMap){
        Map<TreeNode,Integer> visited=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        //Insert the root data to both queue and visited
        q.add(root);
        visited.put(root,1);
        int timer=0;
        while(!q.isEmpty()){
            int size=q.size();
            int flag=0;
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null && !visited.containsKey(curr.left)){
                    flag=1;
                    visited.put(curr.left,1);
                    q.add(curr.left);
                }
                if(curr.right!=null && !visited.containsKey(curr.right)){
                    flag=1;
                    visited.put(curr.right,1);
                    q.add(curr.right);
                }
                if(parentMap.containsKey(curr) && !visited.containsKey(parentMap.get(curr))){
                    flag=1;
                    visited.put(parentMap.get(curr),1);
                    q.add(parentMap.get(curr));
                }
            }
            if(flag==1)
                timer++;
        }
        return timer;
    }

    private TreeNode getInfectedNadPrepareMap(TreeNode root, int start, Map<TreeNode,TreeNode> parentMap){
        TreeNode inf = null;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr.val==start)
                inf=curr;
            if(curr.left!=null){
                parentMap.put(curr.left,curr);
                q.add(curr.left);
            }
            if(curr.right!=null){
                parentMap.put(curr.right,curr);
                q.add(curr.right);
            }
        }
        return inf;
    }

    @Test
    public void tc1(){
        TreeNode root = new TreeNode(1,
                new TreeNode(5,
                        null,
                        new TreeNode(4,
                                new TreeNode(9),
                                new TreeNode(2)
                        ) //parent-4
                ), //Parent-5
                new TreeNode(3,
                        new TreeNode(10),
                        new TreeNode(6))
                );
        System.out.println(this.amountOfTime(root,3));
    }

}
