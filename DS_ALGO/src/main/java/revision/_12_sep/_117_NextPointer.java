package revision._12_sep;

import util.tree.Node;


import java.util.LinkedList;
import java.util.Queue;

public class _117_NextPointer {
    public Node connect(Node root) {
        if(root==null)
            return root;
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        Node prev=null;
        while(!q.isEmpty()){
            Node curr=q.poll();
            if(curr==null){
                if(q.isEmpty())
                    break;
                q.add(null);
            } else{
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
                if(prev!=null){
                    prev.next=curr;
                }
            }
            prev=curr;
        }
        return root;
    }
}
