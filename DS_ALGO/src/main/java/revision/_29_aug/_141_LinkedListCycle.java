package revision._29_aug;

import com.strivers.util.ListNode;
import org.junit.jupiter.api.Test;

import java.util.List;

public class _141_LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head.next==null){ //Single element in list
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null){
            if(slow==fast){
                return true;
            }
            slow=slow.next;
            if(fast.next!=null)
                fast=fast.next.next;
        }
        return false;
    }


    @Test
    public void tc1(){
        ListNode n = new ListNode(3);
        ListNode head=n;
        ListNode joint;
        n.next=new ListNode(2);
        n=n.next;
        joint=n;
        n.next=new ListNode(0);
        n=n.next;
        n.next=new ListNode(-4);
        n=n.next;
        n.next=joint;

        ListNode temp=head;
        int count=0;

        while(temp!=null){
            if(count==15)
                break;
            System.out.print(" "+temp.val);
            temp=temp.next;
            count++;
        }
        System.out.println(this.hasCycle(head));
    }
}
