package interview;
import java.util.*;
import java.io.*;
public class hashmap {
public static void main(String args[])
{
	HashMap<Integer, String> HMap=new HashMap<Integer, String>();
	HMap.put(1,"one");
	HMap.put(2,"Two");
	HMap.put(3, "three");
	HMap.put(4,"four");
	for(Map.Entry<Integer, String> entry : HMap.entrySet())
	{
		int key=entry.getKey();
		String value=entry.getValue();
		System.out.println(key +":"+value);
	}
	}
}
