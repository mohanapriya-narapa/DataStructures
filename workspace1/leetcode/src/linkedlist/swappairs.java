package linkedlist;
import java.util.*;
import linkedlist.linkedlist.Listnode;
import linkedlist.loop.Node;

public class swappairs {
public static class ListNode{
		
		private int data;
		private ListNode next;
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}

	}
private static ListNode head;
public static ListNode swapPairs(ListNode head) {
    if (head == null || head.next == null) return head;
    ListNode second = head.next;
    ListNode third = second.next;
    
    second.next = head;
    head.next = swapPairs(third);
    
    return second;
}
public static void display(ListNode head)
{
	if(head==null)
	{
		return;
	}
	ListNode current=head;
	while(current!=null)
	{
		System.out.println(current.data+"-->");
		current=current.next;
	}System.out.println(current);
}
	public static void main(String[] args) {
		swappairs list = new swappairs();
        list.head = new ListNode(1);
        list.head.next = new ListNode(2);
        list.head.next.next = new ListNode(3);
        list.head.next.next.next = new ListNode(4);
        list.head.next.next.next.next = new ListNode(5);
        ListNode newhead=swapPairs(head);display(newhead);
	}

}
