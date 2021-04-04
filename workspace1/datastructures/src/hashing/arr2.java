package hashing;

import java.util.*;

public class arr2 {

	public static void main(String[] args) {
int[] arr1=new int[] {5, 10, 40, 30, 20};
HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
for(int i=0;i<arr1.length;i++)hs.put(arr1[i],i);
Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>(hs);
printMap(treeMap);

	}
	public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.print(entry.getValue()+" ");
        }}
}
