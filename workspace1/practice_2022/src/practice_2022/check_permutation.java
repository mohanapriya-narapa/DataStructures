package practice_2022;

public class check_permutation {
	public static void main(String[] args) {
	String s="mona";
	String t="onmv";
	boolean flag= permutation(s, t);
System.out.println(flag);

	}

	private static boolean permutation(String s, String t) {
int[] charset=new int[128];
for (int i=0;i<s.length();i++)
{
	charset[s.charAt(i)]++;
}
for(int i=0;i<t.length();i++)
{
	charset[t.charAt(i)]--;
}
for(int i=0;i<charset.length;i++)
{
	if(charset[i]!=0)
	{
		return false;
	}
}

		return true;
	}
}
