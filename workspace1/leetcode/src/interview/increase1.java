package interview;
//import java.util.*;
//import java.io.*;
public class increase1 {

	public static void main(String[] args) {
	int[] arr=new int[] {5,4,1,2,3};
	int x=Integer.MAX_VALUE;int z;boolean isit=false;
	int y=Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++)
	{z=arr[i];
		if(x>=z)
		{
		x=z;	
		}
		else if(y>z){
			y=z;		
		}
		else
		{
		isit=true;	
		}
	}if(isit)System.out.println("true");
	}

}
