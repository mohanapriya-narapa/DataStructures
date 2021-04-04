package arrays;

import java.util.ArrayList;

public class remove {

	public static void main(String[] args) {
	int[] nums=new int[] {3,2,2,3};ArrayList<Integer> al=new ArrayList<Integer>();
	int val=3;
	for(int i=0;i<nums.length;i++)
	{
		if(nums[i]!=3)
		{
			al.add(nums[i]);
		}
	}System.out.println(al);
	System.out.println(al.size());
	}

}
