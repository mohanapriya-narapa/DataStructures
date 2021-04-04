package strings;

import java.util.Arrays;

public class permutation2 {

	public static void main(String[] args) {
	int[] letters=new int[128];boolean flag=true;
	String s1="god";
	String s2="dmh";
	char[] arr1=s1.toCharArray();
	char[] arr2=s2.toCharArray();
	for(int i=0;i<arr1.length;i++)
	{
		letters[arr1[i]]++;
	}
	for(int i=0;i<arr2.length;i++)
	{
		letters[arr2[i]]--;
	}
	for(int i=0;i<letters.length;i++)
	{
		if(letters[i]!=0)
		{
			flag=false;
		}
	}System.out.println(flag);
	}

}
