package geeks;

import java.util.*;
import java.io.*;

public class staackmax {

	public static void main(String[] args) {
		 Stack<Integer> stack = new Stack<Integer>();
		 Stack<Integer> stack2 = new Stack<Integer>();
		 int a[]=new int[] {4,19, 7, 14, 20}; stack.push(a[0]);int b[]=new int[5];int c[]=new int[5];
		 stack2.push(a[0]);
		 for(int i=1;i<a.length;i++)
		 {
			 stack.push(a[i]);
			 stack2.push(Math.max(a[i],stack2.peek()));
		 } for(int i=0;i<a.length;i++)
		 {
			b[i]=stack2.pop();
		 }
		 for(int j=b.length-1;j>=0;j--)
		 {
		System.out.println(b[j]);
		 }Collections.sort(stack);for(int i=0;i<a.length;i++)
		 {
			 System.out.println(stack.pop());
			}
		 }
		
	}


