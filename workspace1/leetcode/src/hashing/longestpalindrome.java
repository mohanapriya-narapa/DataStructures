package hashing;

import java.util.*;

public class longestpalindrome {

	public static void main(String[] args) {
		String s ="abccccdd";
		 if(s==null || s.length()==0) System.out.println("0");
	       HashSet<Character> hs = new HashSet<Character>();
	        int count = 0;
	        for(int i=0;i<s.length();i++)
	        {if(hs.contains(s.charAt(i))){
	        hs.remove(s.charAt(i));
	        count++;
	        
	        }
	        else{
	        	hs.add(s.charAt(i));
	        }
	        	}if(hs.isEmpty())
	        		System.out.println(count*2);
	        	else
	        		System.out.println((count*2)+1);
	        }

}
