package geeks;
import java.util.*;
import java.io.*;

public class mergearrays {

	public static void main(String[] args) {int k=3;int n=4;
	ArrayList<Integer> list =new ArrayList<Integer>();
	int[][] arr=new int[][]  { {1, 3, 5, 7},
        {2, 4, 6, 8},
        {0, 9, 10, 11}} ;
	for(int i=0;i<3;i++)
	{for(int j=0;j<n;j++)
		list.add(arr[i][j]);
	}Collections.sort(list);System.out.println(list);
	}

}
