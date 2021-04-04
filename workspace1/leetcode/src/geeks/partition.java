package geeks;

import java.util.ArrayList;

public class partition {

	public static void main(String[] args) {
		int[] arr=new int[]{1, 14, 5, 20,14, 4, 2, 54, 20, 87, 98, 3, 1, 32} ;
		int  lowVal = 14, highVal = 20;int count1=0;int count2=0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<14)
			{
				list.add(arr[i]);
			}
			else 
			{
				if(arr[i]==14){
					count1++;
				}
			}
			
		}if(count1>0)
			{list.add(14);count1--;}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>14 && arr[i]<20)
			{
				list.add(arr[i]);
			}
			else 
			{
				if(arr[i]==20){
					count2++;
				}
			}
			
		}if(count2>0)
		{list.add(20);count2--;}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>20)
			{
				list.add(arr[i]);
			}
			
		}System.out.println(list);

	}

}
