package arrays;

import java.util.HashSet;

public class findduplicate {

	public static void main(String[] args) {
	int nums[] ={4,3,2,7,8,2,3,1};
	HashSet<Integer> hs=new HashSet<Integer>();
	for(int i=0;i<nums.length;i++)
	{
		if(!hs.add(nums[i])) System.out.print(nums[i] +" ");
	}

	}

}
