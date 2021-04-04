package emory;

import java.util.*;

public class product {

	public static void main(String[] args) {
	int[] arr=new int[] {1,2,3,4};List<Integer> li=new ArrayList<Integer>();
	int prod=1;
	for(int i=0;i<arr.length;i++)
	{
		prod=1;
		for(int j=0;j<arr.length;j++)
			if(i!=j)
			{
				prod*=arr[j];//li.add(prod);
			}li.add(prod);
	}System.out.println(li);
	}

}
