package geeks;

import java.util.*;

public class eqqqualzero {

	public static void main(String[] args) {int sum=0;int i;
//HashMap<Integer, Integer> map1= new HashMap<Integer,Ineger>();
	int[] arr=new int[] {1, 0, 1, 1, 1, 0, 0};int count=0,count2=0;
	int j = 0;
	for( i=0;i<arr.length-1;i++)
	{for(j=i+1;j<arr.length;j++)
	{	if(arr[i]==1)
			count++;
		else{
			count--;
		}
	if(count==0)
	{
		sum=Math.max(j-i, sum);
	}System.out.println(sum);}}
	}

}
