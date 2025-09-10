package leetCode.binarytree;

import util.tree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class _117_NextRightPointer {
    public Node connect(Node root) {
        if(root==null || root.left==null)
            return root;
        Queue<Node> q=new LinkedList<>();
        Node prev = null;
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curr=q.poll();
            if(curr==null){
                if(q.isEmpty())
                    break;
                q.add(null);
            } else{
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
                if(prev!=null)
                    prev.next=curr;
            }
            prev=curr;
        }
        return root;
    }
}
