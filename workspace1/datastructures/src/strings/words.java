package strings;
import java.nio.charset.Charset;
import java.util.*;


public class words {

	public static void main(String[] args) {HashSet al=new HashSet();
String[] words=new String[] {"may", "student", "students", "dog",
        "studentssess", "god", "cat", "act",
        "tab", "bat", "flow", "wolf", "lambs",
        "amy", "yam", "balms", "looped", 
        "poodle"};String[] words1=new String[words.length] ;
for(int i=0;i<words.length;i++)
{
	//sortString(words[i]);
	char[] ch = words[i].toCharArray();
	 Arrays.sort(ch); words1[i]=ch.toString();al.add(words1[i]);
		
	 
		 
	 }System.out.println(al);
}
	}
	


