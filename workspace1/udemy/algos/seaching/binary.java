package seaching;

public class binary {
public static void main(String args[])
{int a[];
a=new int[] {2,4,5,6,8};
	int n=6;
	int p=0;
	int r=n;
	int x=6;
	while(p<=r)
	{
		int q=(p+r)/2;
		if(a[q]==x)
		{
		System.out.println(q);	break;
		}
		
		else
		{
			if(a[q]>x){
				r=q-1;
			}
			else{
				p=q+1;
			}
		}
	}
}
}
