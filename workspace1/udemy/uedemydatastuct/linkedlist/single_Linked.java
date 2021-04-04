package linkedlist;

public class single_Linked {
	private node first;
	public single_Linked()
	{
		
	}
	public boolean isEmpty(){
		return(first==null);
	}
    public void inserFirst(int data)
    {
    	node newnode=new node();
    	newnode.data=data;
    	newnode.next=first;
    	first=newnode;
    }
    public node deleteFirst()
    {
    	node temp=first;
    	first=first.next;
    	return temp;
    }
    public void displayList()
    {
    	node current=first;
    	while(current!=null)
    	{
    		current.displayNode();
    		current=current.next;
    		
    	}System.out.println();
    }
    

}
