package interview;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class list {

	public static void main(String[] args) {
	int[] arr=new int[] {10, 5, 3, 9, 2};
	HashMap<Integer,Integer> in=new HashMap<Integer,Integer>();
	for(int i=0;i<arr.length;i++)
	{
	in.put(Math.abs(arr[i]-7),arr[i]);
	}
    Map<Integer, Integer> treeMap = new TreeMap<Integer,Integer>(in);
System.out.println(in);
	}

}
