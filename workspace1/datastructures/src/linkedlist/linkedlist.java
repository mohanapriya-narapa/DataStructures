package linkedlist;

import linkedlist.linkedlist.Listnode;

public class linkedlist {
public static class Listnode{
		
		private int data;
		private Listnode next;
		public Listnode(int data)
		{
			this.data=data;
			this.next=null;
		}

	}
public static int length(Listnode head)
{
	if(head==null)
	{
		return 0;
	}
	Listnode current=head;int count=0;
	while(current!=null)
	{
		count++;
		current=current.next;
	}return count;
}
	public static void main(String[] args) {
	Listnode head=new Listnode(10);
	Listnode first=new Listnode(11);
	Listnode second=new Listnode(12);
	Listnode third=new Listnode(12);
	head.next=first;
	first.next=second;
	second.next=third;
	System.out.println(length(head));
	}

}
