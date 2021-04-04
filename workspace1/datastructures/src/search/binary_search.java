package search;

public class binary_search {public static void main(String args[]){
int a[]=new int[] {2,4,7,9,18,22,34,56,78};
int x=56;
int p=0;int r=a.length-1;
while(p<=r)
{
	int q=(p+r)/2;
	if(a[q]==x)
	{
		System.out.println(q);break;
	}
	else if(a[q]>x){
		r=q-1;
	}
	else{
	p=q+1;	
	}
}
}
}