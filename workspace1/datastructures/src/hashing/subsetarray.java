package hashing;

import java.util.*;

public class subsetarray {

	public static void main(String[] args) {
	
		HashSet<Integer> hs=new HashSet<Integer>();boolean finaly=false;
		int[] arr1=new int[]{11, 1, 13, 21, 3, 7};
		int[] arr2=new int[]{11, 3, 7, 45};
		for(int i=0;i<arr1.length;i++)
		{
			hs.add(arr1[i]);
			
		}
		for(int j=0;j<arr2.length;j++)
		{
			if(hs.add(arr2[j]))
{finaly=true;System.out.println("false");break;
}		}

	}

}
