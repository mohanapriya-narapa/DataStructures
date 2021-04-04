package arrays1;
import java.util.*;
import java.io.*;

public class array_paartition {

	public static void main(String[] args) {
	int n=6;int count=0;
	int arr[]=new int[] {1,1,0,1,1,1,0,0,1,1,1,1,1};
	
	for(int i=0;i<arr.length;i++)
	{
	if(arr[i]==1)count++;
	else 
		count=0;
	}System.out.println(count);
	}

}
