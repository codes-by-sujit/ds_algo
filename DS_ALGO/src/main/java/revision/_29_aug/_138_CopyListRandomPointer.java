package revision._29_aug;

import com.strivers.util.Node;
import org.junit.jupiter.api.Test;

public class _138_CopyListRandomPointer {
    public Node copyRandomList(Node head) {
        //Insert the new node between 2
        insertTemp(head);
        copyRandom(head);
        return reset(head);
    }

    private void insertTemp(Node head){
        Node n=head;
        while(n!=null){
            Node temp=new Node(n.val);
            Node nextElement = n.next;
            temp.next=nextElement;
            n.next=temp;
            n=nextElement;
        }
    }

    private void copyRandom(Node head){
        Node n=head;
        while(n!=null) {
            Node temp = n.next;
            temp.random = n.random == null ? null : n.random.next;
            n=temp.next;
        }
    }

    private Node reset(Node head){
        Node n=head;
        Node ans=null;
        while(n!=null){
            Node temp=n.next;
            Node nextElement=temp.next;
            n.next=nextElement;
            temp.next=nextElement==null?null:nextElement.next;
            n=nextElement;
            if(ans==null)
                ans=temp;
        }
        return ans;
    }

    @Test
    public void tc1(){
        Node n= new Node(7);
        Node head=n;
        n.next=new Node(13);
        n.next.next=new Node(11);
        n.next.next.next=new Node(10);
        n.next.next.next.next=new Node(1);

        n.random=null;
        n.next.random=n;
        n.next.next.random=n.next.next.next.next;
        n.next.next.next.random=n.next.next;
        n.next.next.next.next.random=n;
        System.out.println("Original Link List");
        this.print(head);
        Node res= this.copyRandomList(head);
        this.print(res);
    }

    private void print(Node head){
        Node n = head;
        System.out.println("");
        while (n != null) {
            int random = n.random==null?-1:n.random.val;
            int next=n.next==null?-1:n.next.val;
            System.out.print("["+n.val+"|"+next+"|"+random+"]");
            n=n.next;
        }
        System.out.println("");
    }
}
