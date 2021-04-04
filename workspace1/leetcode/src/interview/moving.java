package interview;
import java.util.*;
import java.io.*;
public class moving {

	public static void main(String[] args) {
	int[] arr=new int[] {0,1,0,3,1,2};
	int count=0;
    ArrayList<Integer> names = new ArrayList<Integer>();
    for(int i=0;i<arr.length;i++)
    {
    	if(arr[i]==0)
    	{
    		count++;
    	}
    	else{
    		names.add(arr[i]);
    	}
    }
	for(int j=0;j<count;j++)
	{
		names.add(0);
	} for ( int k=0; k<names.size(); k++ )
	      System.out.println(names.get(k) );
	  }

	}


