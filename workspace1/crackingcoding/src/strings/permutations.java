package strings;

import java.util.Arrays;

public class permutations {

	public static void main(String[] args) {
	String str1="dog";boolean flag=true;
	String str2="god";
	char[] arr1=str1.toCharArray();
	char[] arr2=str2.toCharArray();
	Arrays.sort(arr1);
	Arrays.sort(arr2);
for(int i=0;i<str1.length();i++)
{
	if(arr1[i]!=arr2[i])
	{
	flag=false;
	}
}System.out.println(flag);
	}

}
