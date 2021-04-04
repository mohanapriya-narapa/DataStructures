package interview;

import java.util.ArrayList;

public class count {

	public static void main(String[] args) {
		int[] arr=new int[] {0,1,1,2,2,1,0};int low=0;int mid=0;int high=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				low++;
				
			}
			if(arr[i]==1)
			{
				mid++;
			}
			if(arr[i]==2)
			{
				high++;
			}
		}ArrayList<Integer> list =new ArrayList<Integer>();
		for(int i=0;i<low;i++)list.add(0);
		for(int j=0;j<mid;j++)list.add(1);
		for(int k=0;k<high;k++)list.add(2);System.out.println(list);
	}

}
