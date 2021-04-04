package hashing;
import java.io.*;
import java.util.*;
public class intersection {

	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<Integer>();	
		HashSet<Integer> res = new HashSet<Integer>();	
		int[] a= new int[] {1, 2, 2, 1};
		int[] b=new int [] {2, 2};
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for(int j=0;j<b.length;j++)
		{
			if(set.contains(b[j]))
			{
				res.add(b[j]);
				set.remove(b[j]);
			}
		}System.out.println(res);
	}

}
