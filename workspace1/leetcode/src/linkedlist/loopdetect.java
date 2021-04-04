package linkedlist;



import linkedlist.loop.Node;

public class loopdetect {

    static Node head;
 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
    static Node detect(Node node) {
        Node slow = node, fast = node;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
 
            // If slow and fast meet at same point then loop is present
            if (slow == fast) {
                return slow;
            }
        }
        return null;
    }
 
	public static void main(String[] args) {
		loopdetect list = new loopdetect();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next.next;
      Node elem=detect(head);System.out.println(elem.data);
	}

}