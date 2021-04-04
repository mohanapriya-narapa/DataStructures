package linkedlist;

import linkedlist.swappairs.ListNode;

public class loop {

    static Node head;
 
    static class Node {
 
        int data;
        ListNode next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
    boolean detect(Node node) {
        Node slow = node, fast = node;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
 
            // If slow and fast meet at same point then loop is present
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
 
	public static void main(String[] args) {
		loop list = new loop();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next.next;
        System.out.println(list.detect(head));
	}

}
