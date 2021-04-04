package geeks;

import java.util.*;
import java.util.Map;
import java.util.TreeMap;

public class reorder {

	public static void main(String[] args) {
	int arr[] = new  int[] {10, 11, 12};
	int index[] =new int[] {1,0,2};
	 Map<Integer, Integer> unsortMap = new HashMap<Integer, Integer>();
	 for(int i=0;i<arr.length;i++)
	 {
		 unsortMap.put(index[i],arr[i]);
	 }
	 Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>(unsortMap);
	  printMap(treeMap);
	}
	 public static <K, V> void printMap(Map<K, V> map) {
	        for (Map.Entry<K, V> entry : map.entrySet()) {
	            System.out.println("Key : " + entry.getKey()
					+ " Value : " + entry.getValue());
	        }}

}
