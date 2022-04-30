package practice_2022;

public class palindromePermutation {

	public static void main(String[] args) {
		String str="tact cao";
		boolean flag= isPalindromePermutation(str);
		System.out.println(flag);
	}

	private static boolean isPalindromePermutation(String str) {
		int[] charset=new int[128];int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=32)
			{
			charset[str.charAt(i)]++;
			}
		}
		for(int i=0;i<charset.length;i++)
		{
			if(charset[i]>0 && ((charset[i]%2)!=0))
			{
				System.out.println((char)i);
				System.out.println(charset[i]);
			count++;
			}
		}
		System.out.println(count);
		if(count>1)
		return false;
	    return true;
	}

}
