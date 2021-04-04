package emory;
import java.util.*;
public class kdiffpairs {

	public static void main(String[] args) {
	int[] arr=new int[] {3, 1, 4, 1, 5};int k=2;HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
		if(Math.abs((arr[i]-arr[j]))==2)
		{
			hs.put(arr[i], arr[j]);
		}
		}
			
	}
System.out.println(hs);
	}

}
