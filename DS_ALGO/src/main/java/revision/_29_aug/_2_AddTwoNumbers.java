package revision._29_aug;

import com.strivers.util.LinkListUtil;
import com.strivers.util.ListNode;
import org.junit.jupiter.api.Test;

public class _2_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=0;
        int carry=0;
        ListNode temp=new ListNode(0);;
        ListNode ans=temp;
        while(l1!=null || l2!=null || carry==1){
            sum=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            carry=sum/10;
            temp.next= new ListNode(sum%10);
            temp=temp.next;
        }
        return ans.next;
    }
    @Test
    public void tc(){
        ListNode i = new ListNode(2);
        ListNode head=i;
        i.next=new ListNode(4);
        i=i.next;
        i.next=new ListNode(3);
        LinkListUtil.print(head);

        ListNode j = new ListNode(5);
        ListNode h2=j;
        j.next=new ListNode(6);
        j=j.next;
        j.next=new ListNode(4);

        LinkListUtil.print(h2);
        LinkListUtil.print(this.addTwoNumbers(head,h2));
    }

}
