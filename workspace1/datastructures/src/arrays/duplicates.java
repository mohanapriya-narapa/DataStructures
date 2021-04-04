package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class duplicates{

	public static void main(String[] args) {
	int[] nums=new int[] {1,2,2,4};
HashSet<Integer> hs=new HashSet<Integer>();
for(int i=0;i<nums.length;i++)
	hs.add(nums[i]);System.out.println(hs.size());
	}

}
