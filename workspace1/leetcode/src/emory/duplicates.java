package emory;
import java.util.*;
public class duplicates {

	public static void main(String[] args) {
	int[] arr=new int[] {4,3,2,7,8,2,3,1};
	HashSet<Integer> hs=new HashSet<Integer>();List<Integer> li=new LinkedList<Integer>();
	for(int i=0;i<arr.length;i++)
	{
	if(hs.contains(arr[i]))
	{
		li.add(arr[i]);
	}
	else{
		hs.add(arr[i]);
	}
	}System.out.println(li);
	}

}
