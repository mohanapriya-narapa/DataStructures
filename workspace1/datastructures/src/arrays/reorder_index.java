package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class reorder_index {

	public static void main(String[] args) {
	HashMap<Integer,Integer> hs =new HashMap<Integer,Integer>();
	int[] arr=new int[] {50, 40, 70, 60, 90};
	int[] index=new int[] {3,  0,  4,  1,  2};
	for(int i=0;i<arr.length;i++)
	{
	hs.put(index[i],arr[i]);
	}
	 Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>(hs);
	    printMap(treeMap);
	}

	private static void printMap(Map<Integer, Integer> treeMap) {ArrayList<Integer> ar=new ArrayList<Integer>();
	ArrayList<Integer> ar1=new ArrayList<Integer>(); 
	for (Entry<Integer, Integer> entry : treeMap.entrySet()) {
           ar.add(entry.getValue());
           ar1.add(entry.getKey());}
           System.out.println(ar);
           System.out.println(ar1);
         }
		
	}


