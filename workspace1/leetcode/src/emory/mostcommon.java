package emory;

import java.util.HashMap;

public class mostcommon {

	public static void main(String[] args) {
String arr= "Bob hit a Ball the hit Ball flew far after it was hit";
String[] arr1=arr.split(" ");int count,max=1;HashMap<String,Integer> hs=new HashMap<String,Integer>();
for(int i=0;i<arr1.length-1;i++)
{
	count=1;
	for(int j=i+1;j<arr1.length;j++)
	{
		if(arr1[i].equals(arr1[j]))
		{
			if(!arr1[i].equals("hit")){count++;hs.put(arr1[i], count);max=Math.max(count, max);}
		}
	}
}
System.out.println(max);

	}

}
