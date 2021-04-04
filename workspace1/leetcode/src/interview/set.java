package interview;
import java.io.*;
import java.util.*;
public class set {

	public static void main(String[] args) {
		int[] nums=new int[] {1,2,3,2,5,6};
HashSet<Integer> set=new HashSet<Integer>();
for(int i: nums)
{
	if(!set.add(i))
	{ 
		System.out.println("duplicate");
		} }

	}

}
