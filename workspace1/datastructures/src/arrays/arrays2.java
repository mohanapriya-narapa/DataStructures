package arrays;

import java.util.ArrayList;

public class arrays2 {

	public static void main(String[] args) {
	int num[] =new int[] {3,2,2,3};int val=3;
	ArrayList<Integer> al=new ArrayList<Integer>();
	for(int i=0;i<num.length;i++)
	{
		if(num[i]!=3)
		{
		al.add(num[i]);	
		}
	}
System.out.println(al.size());
	}

}
