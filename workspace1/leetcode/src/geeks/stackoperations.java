package geeks;

import java.util.Stack;

public class stackoperations {

	public static void main(String[] args) {
int[] a=new int[]{5,6,8,9,2};
		
		for(int i=0;i<a.length;i++)
			push(a[i]);
		pop();
		findMiddle(a);
	}

	public static void findMiddle(int a[]) {
		
		for(int i=0;i<a.length;i++)
			push(a[i]);
		for(int i=0;i<a.length/2;i++){
		pop();	
		System.out.println(pop());
		}
	}

	public static int pop() {
		
		 Stack<Integer> stack1 = new Stack<Integer>();return stack1.pop();	
	}
	
	public static void push(int i) {
		 Stack<Integer> stack1 = new Stack<Integer>();stack1.push(i);		
	}

}
