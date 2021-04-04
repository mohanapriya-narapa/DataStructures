package linkedlist;

import linkedlist.node_count.Listnode;

public class nthnode_from_end {
public static class Listnode{
		
		private int data;
		private Listnode next;
		public Listnode(int data)
		{
			this.data=data;
			this.next=null;
		}

	}public static void nth_fromend(Listnode head, int n)
{
		Listnode slow=head;
		Listnode fast=head;
		int count=0;
		while(count<n)
		{
			fast=fast.next;
			count++;
		}
		while(fast!=null)
		{
			slow=slow.next;
			fast=fast.next;
		}System.out.println(slow.data);
}
	public static void main(String[] args) {
		Listnode head=new Listnode(10);
		Listnode first=new Listnode(10);
		Listnode second=new Listnode(12);
		Listnode third=new Listnode(12);
		Listnode fourth=new Listnode(10);
		head.next=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
	int n=2;nth_fromend(head,2);
	}

}
