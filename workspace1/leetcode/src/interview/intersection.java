package interview;
import java.io.*;
import java.util.*;

public class intersection {

	public static void main(String[] args) {
	    ArrayList<Integer> names = new ArrayList<Integer>();
		int a1[]=new int[] {1,2,4,8,3};
		int a2[]=new int[] {2,7,6,3};
		int i,j;
		int i1[]=new int[10];
		for(i=0;i<a1.length;i++)
		{
			for(j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j]){
					names.add(a1[i]);
				}
			}
		}
	System.out.println(names);
	}

}
