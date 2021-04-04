package strings;
import java.util.*;
public class reversevowels {

	public static void main(String[] args) {
		
	String s="hello";
	String vowels = "aeiouAEIOU";
	  char[] chars = s.toCharArray();
	    int start = 0;
	    int end = s.length()-1;
	    while(start<end){
	        
	        while(start<end && !vowels.contains(chars[start]+"")){
	            start++;
	        }
	        
	        while(start<end && !vowels.contains(chars[end]+"")){
	            end--;
	        }
	        
	        char temp = chars[start];
	        chars[start] = chars[end];
	        chars[end] = temp;
	        
	        start++;
	        end--;
	    }System.out.println(Arrays.toString(chars));
	} 

}
