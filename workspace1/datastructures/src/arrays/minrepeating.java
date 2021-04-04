package arrays;

import java.util.HashSet;

public class minrepeating {

	public static void main(String[] args) {
		 int arr[] = {10, 5, 3, 4, 3, 5, 6};
		 int min=-1;
		 HashSet<Integer> hs=new HashSet<Integer>();
		 for(int i=arr.length-1;i>=0;i--)
		 {
			 if(hs.contains(arr[i]))
				 min=i;
			 else
				 hs.add(arr[i]);
			 
		 }
System.out.println(min);
	}

}
