package linkedlist;

import linkedlist.linkedlist.Listnode;

public class nth_node {
public static class Listnode{
		
		private int data;
		private Listnode next;
		public Listnode(int data)
		{
			this.data=data;
			this.next=null;
		}

	}
public static int nodereturn(Listnode head, int index)
{
	Listnode current=head;
	int count=0;
	while(current!=null)
	{
		if(count==index)
		{
			return current.data;
		}count++;
		current=current.next;
	}return 0;
	
}
	public static void main(String[] args) {
		Listnode head=new Listnode(10);
		Listnode first=new Listnode(11);
		Listnode second=new Listnode(12);
		Listnode third=new Listnode(12);
		head.next=first;
		first.next=second;
		second.next=third;
		int index=3;
		System.out.println(nodereturn(head,3));
	}

}
