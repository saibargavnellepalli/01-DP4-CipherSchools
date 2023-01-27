package Week1.LinkedList;

import java.util.Scanner;

public class addAtEnd {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int n) {
            data = n;
            next = null;
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        head = null;
        if (n > 0) {
            head = new addAtEnd.Node(s.nextInt());
            addAtEnd.Node temp = head;
            for (int i = 1; i < n; i++) {
                temp.next = new addAtEnd.Node(s.nextInt());
                temp = temp.next;
            }
        }

    }


    // Method to add the element at the end of the list
    static void addAtEnd(int k) {
        // Write your code here
        addAtEnd.Node n = new addAtEnd.Node(k);
        addAtEnd.Node current = head;
        while (current.next!= null) {

            current=current.next;
        }
        current.next=n;

    }
}



