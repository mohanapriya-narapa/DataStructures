package arrays;

import java.util.*;

public class movezeroes {

	public static void main(String[] args) {
	int[]nums=new int[] { 2, 3, 0, 0,4};int j=nums.length-1;int temp=0;int count=0;List<Integer> ll=new LinkedList<Integer>();
	for(int i=0;i<nums.length-1;i++)
	{if(nums[i]==0)
		{
		count++;}}
	for(int i=0;i<nums.length;i++)
		{
		if(nums[i]!=0)
		{ll.add(nums[i]);
		}
		}for(int i=0;i<count;i++)
		{
			ll.add(0);
		}System.out.println(ll);
	}
	}
		
		
		

	

