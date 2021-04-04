package geeks;

import java.util.*;

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
public void display(Listnode head)
{
	if(head==null)
	{
		return;
	}
	Listnode current=head;
	while(current!=null)
	{
		System.out.println(current.data+"-->");
		current=current.next;
	}System.out.println(current);
}
public Listnode insertbeginning (Listnode head, int data)
{
	Listnode newnode=new Listnode(data);
	if(head==null)
	{
		return newnode;
	}
	newnode.next=head;
	head=newnode;
	return head;
	
}

	
		public static void main(String args[])
		{

			Listnode head=new Listnode(10);
			Listnode first=new Listnode(12);
			Listnode second=new Listnode(13);
			Listnode third=new Listnode(14);
			head.next=first;
			first.next=second;
			second.next=third;
		linkedlist ll=new linkedlist();
		ll.display(head);
		Listnode newhead = ll. insertbeginning(head,15);
		ll.display(newhead);
		}

	}


