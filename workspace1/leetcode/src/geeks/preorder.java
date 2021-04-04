package geeks;

import java.util.Stack;

public class preorder {

	public static void main(String[] args) {boolean isit=false;
		int[] pre = new int[]{40, 30, 35, 80, 100};
		 Stack<Integer> s = new Stack<Integer>();
		 int root = Integer.MIN_VALUE;
		 for(int i=0;i<pre.length;i++)
		 {
			 if(pre[i]<root)
			 {
				 System.out.println("false");
				 isit=true;
			 }
			 while (!s.empty() && s.peek() < pre[i]) {
	                root = s.peek();
	                s.pop();
	            } s.push(pre[i]);
		 }
if(isit==false)System.out.println("true");
	}

}
