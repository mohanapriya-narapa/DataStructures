package linkedlist;

import linkedlist.loop.Node;

public class palindrome {
static ListNode head;
	 
    static class ListNode {
 
        int data;
        ListNode next;
 
        ListNode(int d) {
            data = d;
            next = null;
        }}
    public static boolean isPalindrome(ListNode head) {
	    ListNode fast = head, slow = head;
	    while (fast != null && fast.next != null) {
	        fast = fast.next.next;
	        slow = slow.next;
	    }
	    if (fast != null) { // odd nodes: let right half smaller
	        slow = slow.next;
	    }
	    slow = reverse(slow);
	    fast = head;
	    
	    while (slow != null) {
	        if (fast.data != slow.data) {
	            return false;
	        }
	        fast = fast.next;
	        slow = slow.next;
	    }
	    return true;
	}

	public static ListNode reverse(ListNode head) {
	    ListNode prev = null;
	    while (head != null) {
	        ListNode next = head.next;
	        head.next = prev;
	        prev = head;
	        head = next;
	    }
	    return prev;
	}
	public static void main(String[] args) {
		palindrome list = new palindrome();
		list.head = new ListNode(1);
        list.head.next = new ListNode(2);
        list.head.next.next = new ListNode(3);
        list.head.next.next.next = new ListNode(2);
        list.head.next.next.next.next = new ListNode(1);
        System.out.println(isPalindrome(head));
	}

}
