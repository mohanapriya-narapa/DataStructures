package emory;

import java.util.HashSet;

public class duplicate {

	public static void main(String[] args) {
	int[] arr=new int[]{1,1,2,3};HashSet<Integer> hs=new HashSet<Integer>();
	for(int i=0;i<arr.length;i++)
	{
		if(hs.contains(arr[i])){System.out.println(true);break;}
		else{
			hs.add(arr[i]);
		}
	}
	}

}
