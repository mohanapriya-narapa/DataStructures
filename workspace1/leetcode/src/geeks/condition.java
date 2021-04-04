package geeks;

import java.util.Arrays;
import java.util.Stack;

public class condition {
	public static void main(String args[]){
int[] a=new int[] {12, 4, 78, 90, 45, 23};
	Stack<Integer> stc =new Stack<Integer>();
	for(int i=1;i<a.length;i++)
	{if(a[i-1]<a[i])
		stc.push(a[i-1]);
	
		}
	}

}
