package arrays;
import java.util.*;
public class array1 {

	public static void main(String[] args) {
	int[] nums=new int[] {2, 7, 11, 15};int[] result = new int[2];
	   Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	int target=9;
	for(int i=0;i<nums.length;i++)
	{if(map.containsKey(target-nums[i]))
	{
		result[1]=i+1;
		 result[0] = map.get(target - nums[i]);

	}
map.put(nums[i], i+1);
	}
	System.out.println(Arrays.toString(result));}

}
