package linkedlist;

import linkedlist.linkedlist.Listnode;

public class detectloop {
public static class Listnode{
		
		private int data;
		private Listnode next;
		public Listnode(int data)
		{
			this.data=data;
			this.next=null;
		}

	}
public static int detectloop(Listnode head)
{
	Listnode slow_p=head;
	Listnode fast_p=head;
	 while (slow_p != null && fast_p != null && fast_p.next != null) {
         slow_p = slow_p.next;
         fast_p = fast_p.next.next;
         if (slow_p == fast_p) {
             System.out.println("Found loop");
             return 1;
         }
     }
     return 0;
}
	public static void main(String[] args) {
		Listnode head=new Listnode(10);
		Listnode first=new Listnode(11);
		Listnode second=new Listnode(12);
		Listnode third=new Listnode(12);
		head.next=first;
		first.next=second;
		second.next=third;third.next=head;	detectloop(head);
	}

}
