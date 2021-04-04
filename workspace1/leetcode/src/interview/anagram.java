package interview;

public class anagram {

	public static void main(String[] args) {
		int[] arr = new int[100]; boolean isit=false;int j;
		String s="man"; String t="nam";
		for(int i=0;i<s.length();i++)
		{
			arr[s.charAt(i)-'a']++;
			arr[t.charAt(i)-'a']--;
		}
		for(j=0;j<arr.length;j++){
			if(arr[j]!=0) isit=false;

		}
		
		isit=true;
if(isit)System.out.println(true);
	}

}
