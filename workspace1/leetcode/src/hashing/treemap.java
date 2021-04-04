package hashing;

import java.util.*;
public class treemap {
    public static void main(String[] args) {
    HashMap<Integer, String> unsortMap = new HashMap<Integer, String>();
    String[] strr=new String[] {"GeeksforGeeeks", "I", "from", "am"};
    int a[]=new int[strr.length];
    for(int i=0;i<strr.length;i++)
    {
    a[i]=strr[i].length();
    unsortMap.put(a[i], strr[i]);
    } 
    Map<Integer, String> treeMap = new TreeMap<Integer, String>(unsortMap);
    printMap(treeMap);

    }

    public static <K, V> void printMap(Map<K, V> map) {
           for (Map.Entry<K, V> entry : map.entrySet()) {
               System.out.print(entry.getValue()+" ");
           }}

    }