package Arrays;

public class PalindromePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(PalindromePermutation("taco coa"));
	}

	private static boolean PalindromePermutation(String str) {
		// TODO Auto-generated method stub
		int[] arr= new int[128];
		int count=0;
		for(int i=0;i<str.length();i++)
		{if(str.charAt(i)!=32)
			arr[str.charAt(i)]++;
		}
		
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]>0 && arr[j]%2!=0)
			{
				count++;
			}
		}
		if(count>1)
			return false;
		return true;
	}

}
