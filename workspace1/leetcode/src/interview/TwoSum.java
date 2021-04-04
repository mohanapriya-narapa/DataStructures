package interview;
import java.io.*;
import java.util.*;
public class TwoSum {
	//TwoSum ts=new TwoSum();
	public static void main(String args[])
	{TwoSum ts=new TwoSum();
		int num=1;
		int valuee=4;
		
		ts.find(valuee);
	ts.add(num);
	int num1=3;
	ts.add(num1);
	
	System.out.println(ts.find(valuee)?"yes":"no");

		
	}
	public HashMap<Integer, Integer> elements = new HashMap<Integer, Integer>();
	public void add(int number) 
	{ if (elements.containsKey(number)) 
	{ elements.put(number, elements.get(number) + 1); 
	} 
	else { elements.put(number, 1); } }
	public boolean find(int value)
	{ for (Integer i : elements.keySet()) 
	{ int target = value - i; if (elements.containsKey(target)) 
	{ if (i == target && elements.get(target) < 2) { continue; } return true; } 
	} return false;

	}}
