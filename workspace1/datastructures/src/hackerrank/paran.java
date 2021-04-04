package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class paran {

    public static String isBalanced(String s) {
    	Stack<Character> stack = new Stack<Character>();
     
        for(int i = 0; i<s.length(); i++) {
        
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                stack.push(s.charAt(i));
        
            else if(s.charAt(i) == ')' && !stack.empty() && stack.peek() == '(')
                stack.pop();
            else if(s.charAt(i) == ']' && !stack.empty() && stack.peek() == '[')
                stack.pop();
            else if(s.charAt(i) == '}' && !stack.empty() && stack.peek() == '{')
                stack.pop();
            else
                return "NO";
        }
     
        if( stack.empty())
        	return "yes";
        else
        	return "no";
    }

    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
          //  if(result)System.out.println("yes");
            //else System.out.println("No");
            System.out.println(result);
        }
        in.close();
    }
    
}