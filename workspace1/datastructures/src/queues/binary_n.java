package queues;

import java.util.LinkedList;
import java.util.Queue;

public class binary_n {

	public static void main(String[] args) {
	int n=10;
	Queue<String> qu=new LinkedList<String>();
	qu.add("1");
	while(n-->0)
	{
		//String s1=qu.peek();
		//qu.remove();
		String s1=qu.poll();System.out.println(s1);
		String s2=s1;
		qu.add(s1+"0");
		qu.add(s2+"1");
	}
	
	}

}
