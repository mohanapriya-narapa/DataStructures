package geeks;

import java.util.HashMap;
import java.util.Map;

public class string {
public static void main(String args[])
		{int count=0; 
	String str="geeks is a computer science portal for geeks";
	String[] strr=new String[] {"welcome", "to", "geeks", "portal"};
	String strArray[] = str.split(" ");
	  for(int i=0;i<strr.length;i++){
		  for(int j=0;j<strArray.length;j++)
		  {
			  if(strr[i].equals(strArray[j]))
				  count++;
		  }
}System.out.println(count);
		}
}
