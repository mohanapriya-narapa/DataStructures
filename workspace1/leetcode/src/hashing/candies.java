package hashing;

import java.util.HashSet;

public class candies {

	public static void main(String[] args) {
	HashSet<Integer> hs=new HashSet<Integer>();
	int a[] =new int[] {1,1,2,2,3,3};
	int x=a.length/2;
	for(int i=0;i<a.length;i++)
	{
		hs.add(a[i]);
	}
if(hs.size()<a.length)
	{System.out.println(hs.size());
	}
	else
	{
		
		System.out.println(a.length/2);
	}
}}
