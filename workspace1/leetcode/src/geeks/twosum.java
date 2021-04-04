package geeks;

import java.util.ArrayList;
import java.util.HashMap;

public class twosum {

	public static void main(String[] args) {
	int[] a=new int[] {2, 7, 11, 15};int x=9;boolean isit=false;
	 HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();ArrayList<Integer> list=new ArrayList<Integer>();
	 for (int i = 0; i < a.length; i++) {
	        if (map.containsKey(x - a[i])) {
	           // result[1] = i + 1;
	        	list.add(i+1);
	           
	            list.add( map.get(x - a[i]));
	        // isit=true; 
	         System.out.println(list);break;
	        }
	        map.put(a[i], i + 1);
	    }
	  //System.out.println(list);
	}
	}


