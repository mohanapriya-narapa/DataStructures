package arrays;
import java.util.*;
public class subarraywithsum {

	public static void main(String[] args) {HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
	int[] arr=new int[] {1, 4, 20, 3, 10, 5};int sum1;
	int sum=33;
	for(int i=0;i<arr.length-1;i++)
	{sum1 =arr[i];
		for(int j=i+1;j<arr.length;j++)
		{
			sum1+=arr[j];
			if(sum1==sum)
			{	hs.put(i,j);	
			}
		}
	}System.out.println(hs);
	}

}
