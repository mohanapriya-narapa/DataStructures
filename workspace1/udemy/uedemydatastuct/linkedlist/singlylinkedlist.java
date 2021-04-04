package linkedlist;

public class singlylinkedlist {
//private Listnode head;
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
private static class Listnode{
	
	private int data;
	private Listnode next;
	public Listnode(int data)
	{
		this.data=data;
		this.next=null;
	}

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
}
}
