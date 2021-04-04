package arrays;
import java.io.*;
import java.util.*;
public class equal_onesand_zeros {

	public static void main (String[] args) {
	int[] arr =new int[] {1, 0, 0, 1, 0, 1, 1};
	int maxsize=-1;int sum=0;
	int startIndex=0;int endindex=0;
	for(int i=0;i<6;i++)
	{sum=(arr[i]==0)?-1:1;
		for(int j=i+1;j<7;i++)
		{
			if(arr[j]==0)
				sum+=-1;
			else
				sum+=1;
			if((sum)==0 && (maxsize<j-i+1))
			{
				maxsize=j-i+1;
				startIndex=i;
			}
		}
	}endindex=maxsize+startIndex-1;
	System.out.println(startIndex + "to"+ endindex);
	System.out.println("ggss");
	}

}
