package emory;

import java.util.*;

public class distinctinsubarray {

	public static void main(String[] args) {
int[] arr=new int[]{1, 2, 1, 3, 4, 2, 3};int size=0,max=0;
HashSet<Integer> hs=new HashSet<Integer>();int k=4;
ArrayList<Integer> al=new ArrayList<Integer>();
for(int i=0;i<arr.length-k+1;i++){
	hs.clear();
	for(int j=i;j<k+i;j++)
	{
		hs.add(arr[j]);
	}al.add(hs.size());
}
System.out.println(al);
	}

}
