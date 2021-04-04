package geeks;

import java.util.ArrayList;
import java.util.Stack;

public class nextstack {

	public static void main(String[] args) {
		int a[]=new int[] {9, 8, 7, 3, 2, 1, 6};ArrayList<Integer> list=new ArrayList<Integer>();
		 Stack<Integer> stack = new Stack<>();
		 for(int i=0;i<a.length-1;i++)
		 {stack.push(0);
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(stack.peek()<a[j])
				 {
					 stack.push(a[j]);
				 }
			 }list.add(stack.pop());
		 }System.out.println(list);

	}

}
