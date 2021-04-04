package tress;

import java.io.*;
import java.util.*;

public class bintree {
private static class Node{
	private int data;
	private Node left,right;
	public Node(int item)
	{
		this.data=item;
		this.left=null;
		this.right=null;
		
	}
}Node root;
public void printLevelOrder() 
{
Queue<Node> qs=new LinkedList<Node>();
Stack<Node> st=new Stack<Node>();
qs.add(root);
while(!qs.isEmpty())
{
	Node tempnode=qs.poll();
st.push(tempnode);


	if(tempnode.right!=null)
	{
		qs.add(tempnode.left);
		
	}
	if(tempnode.left!=null)
	{
		qs.add(tempnode.right);
	}
}while(st.empty()==false)
{
	Node tempnodee=st.peek();
	System.out.println(tempnodee);
	st.pop();
}
}
	public static void main(String[] args) {
		bintree bt=new bintree();
		bt.root=new Node(1);
		bt.root.left=new Node(2);
		bt.root.left.left = new Node(4);
	    bt.root.left.right = new Node(5);
		

	     System.out.println("Level order traversal of binary tree is - ");
	  bt.printLevelOrder();
	}

}
