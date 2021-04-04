package geeks;
import java.util.*;
import java.io.*;
public class stackreverse {

	public static void main(String[] args) {
		 Stack<Character> stack = new Stack<Character>();
	     String str="geeksfor";
	     for(int i=0;i<str.length();i++)
	     {
	    	 stack.push(str.charAt(i));
	     }for(int i=0;i<str.length();i++){
	    	 System.out.print(stack.pop());
	     }
	}

}
