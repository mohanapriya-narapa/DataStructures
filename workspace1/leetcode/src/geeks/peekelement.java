package geeks;

import java.util.ArrayList;

public class peekelement {

	public static void main(String[] args) {
		int a[] =new int[] {5, 10, 20, 15,30};int n=a.length;
		ArrayList<Integer> list=new ArrayList<Integer>();
		if(a[0]>a[1])
			list.add(a[0]);
		for(int i=1;i<a.length-1;i++)
		{
			if((a[i-1]<a[i]) &&(a[i]>a[i+1] ))
					{
				list.add(a[i]);
					}
		}
		if(a[n-2]<a[n-1])
			list.add(a[n-1]);
			System.out.println(list);

	}

}
