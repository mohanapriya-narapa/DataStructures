package strings;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class subdistinct {

	public static void main(String[] args) {
	String str="aa";int k=1;boolean isit=true;
	LinkedHashSet hs=new LinkedHashSet();
for(int i=0;i<str.length()-k+1;i++)
{hs.clear();
	for(int j=i;j<str.length();j++)
	{
		if(!hs.add(str.charAt(j)))isit=false;
		
	}if(hs.size()==k)System.out.println(hs);
}
	}

}
