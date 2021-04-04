package emory;

import java.util.HashMap;

public class subarraywithsum {

	public static void main(String[] args) {
	int[] arr=new int[]{1, 4, 20, 3, 10, 5};
	int maxendhere=0,maxsofar=0;
	for(int i=0;i<arr.length;i++){
	maxendhere+=arr[i];
	if(maxendhere<0)
	{
		maxendhere=0;
	}if(maxsofar<maxendhere)
	{
		maxsofar=maxendhere;
	}
	}System.out.println(maxsofar);
	}
	}


