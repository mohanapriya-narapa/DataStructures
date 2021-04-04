package leetcode;

public class permutationstring {
public static void main(String args[])
{
	String str="ABC";
	int n=str.length();
	permutation(str,0,n-1);
}
public static void permutation(String str, int l,int r)
{
	if (l == r)
        System.out.println(str);
    else
    {
        for (int i = l; i <= r; i++)
        {
            str = swap(str,l,i);
            permutation(str, l+1, r);
            str = swap(str,l,i);
        }
    }
}
public static String swap(String a, int i,int j)
{
char temp;
char[] chari=a.toCharArray();
temp=chari[i];
chari[i]=chari[j];
chari[j]=temp;
return String.valueOf(chari);

}
}
