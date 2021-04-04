package geeks;

import java.util.*;
import java.io.*;

public class twounique {

	public static void main(String[] args) {boolean isit=false;
		int[] a=new int[] {1,2,3, 2, 1, 4,3};int count=0;
		
		int[] b=new int[] {0,0,0,0,0,0,0};Arrays.sort(a);
		Set<Integer> dupes = new HashSet<Integer>(); 
		for (int i : a)
		{ if (dupes.add(i)) isit=true;
		else
		{ b[i]=a[i];
		}
		}for(int k=0;k<a.length;k++)System.out.println(b[k]);

	}

}
