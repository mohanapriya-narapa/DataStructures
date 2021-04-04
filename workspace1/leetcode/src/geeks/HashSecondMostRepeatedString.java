package geeks;

import java.util.*;
public class HashSecondMostRepeatedString {
public static void main(String args[])
{
   String str[]=new String[] {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"};
   HashSet<String> map= new HashSet<String>();
   HashMap<String, Integer> map1= new HashMap<String, Integer>();
   for(int i=0;i<str.length;i++)
   {
      Integer count = (map1).get(str[i]);
      if((count == null))
      {
          map1.put(str[i],1);
      }
      else
      {
          map1.put(str[i],count + 1);
      }
   }
   Map<String , Integer> tree= new TreeMap<String, Integer>(map1);
   printMap(tree);
}
public static void printMap(Map<String, Integer> map){
   int l=0;
   for (Map.Entry<String, Integer> entry : map.entrySet()) {
      if(l==0)
      {
          l=l+1;
      }
      else
      {
      System.out.println("Key : " + entry.getKey() + " Value : "
          + entry.getValue());
      break;
      }
   }
 }
}