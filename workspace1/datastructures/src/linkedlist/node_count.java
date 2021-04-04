package linkedlist;

import linkedlist.detectloop.Listnode;

public class node_count {
public static class Listnode{
		
		private int data;
		private Listnode next;
		public Listnode(int data)
		{
			this.data=data;
			this.next=null;
		}

	}
public static int count(Listnode head, int search)
{Listnode current=head;
	int count=0;
	while(current!=null)
	{
		if(current.data==search)
		{
			count++;
			
		}current=current.next;
	}return count;
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
		System.out.println(count(head,10));
	}
	

}
