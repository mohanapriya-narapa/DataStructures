package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class arrays2 {

	public static void main(String[] args) {
int[] arr=new int[] {4,3,2,7,8,2,3,1};Arrays.sort(arr);ArrayList<Integer> ar=new ArrayList<Integer>();HashSet<Integer> hs=new HashSet<Integer>();
for(int i=0;i<arr.length;i++)
{
	hs.add(arr[i]);
}Integer[] b = hs.toArray(new Integer[hs.size()]);int j=1;
for(int i=0;i<b.length-1;i++)
{
if(b[i]!=j)
	ar.add(b[i]);j++;
}System.out.println(ar);
	}

}
