package Week1.LinkedList;

public class reverseLinkedList {

    public IntroLinkedList.Node reverseList(IntroLinkedList.Node head) {
        IntroLinkedList.Node curNode = head;
        IntroLinkedList.Node t = null;
        IntroLinkedList.Node prev = null;

        while(curNode != null){
            t = curNode.next;
            curNode.next = prev;
            prev = curNode;
            curNode = t;
        }

        return prev;

    }
}

