package interview;
import java.io.*;
import java.util.*;

public class uglylist {

	public static void main(String[] args) {
	int n=6;boolean isit=false;
	if(n<0)
	isit=false;	
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(1);
	int i=0;int j=0;int k=0;
	while(list.size()<n)
	{
		int m2=list.get(i)*2;
		int m3=list.get(i)*3;
		int m5=list.get(i)*5;
		int min = Math.min(m2, Math.min(m3, m5)); list.add(min);
if(min==m2)i++;
if(min==m3)j++;
if(min==m5)k++;
	}System.out.println(list.size()-1);
	}

}
