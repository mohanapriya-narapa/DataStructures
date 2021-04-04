package geeks;
import java.util.*;
public class rearrange {

	public static void main(String[] args) {
		 HashMap<Integer, Integer> map1= new HashMap<Integer, Integer>();
		 int a[]=new int[] {1, 3, 0, 2};
		 for(int i=0;i<a.length;i++)
		 {
			 map1.put(a[i],i);
		 }
		 for (Map.Entry<Integer,Integer> map11 : map1.entrySet()) {
             Integer key = map11.getValue();
             System.out.println(key);
		   }
	}

}
