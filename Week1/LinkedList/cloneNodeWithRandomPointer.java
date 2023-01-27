package Week1.LinkedList;

class Solution {
    public Node copyRandomList(Node head) {
        Node curr=head;
        while(curr!=null)
        {
            Node newNode=new Node(curr.val);
            Node temp=curr.next;
            curr.next=newNode;
            newNode.next=temp;
            curr=temp;
        }
        curr=head;
        while(curr!=null)
        {
            if(curr.next!=null)
            {
                curr.next.random=(curr.random!=null)?curr.random.next:null;
            }
            curr=curr.next.next;
        }
        Node dummy=new Node(0);
        curr=head;
        Node clone=dummy;
        Node temp;
        while(curr!=null)
        {
            temp=curr.next.next;
            clone.next=curr.next;
            curr.next=temp;
            clone=clone.next;
            curr=temp;
        }
        return dummy.next;
    }
}