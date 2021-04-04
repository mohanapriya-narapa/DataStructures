package leetcode;

public class string {
public static void main(String args[])
		{
	int num=1556;
	System.out.println(istidy(num)?"yes":"no");
		}
static boolean istidy(int num)
{int prev=10;
while(num!=0)
{
	int rem=num%10;
	num/=10;
	if(rem>prev)
		return false;
	prev=rem;
}
	return true;
}
}
