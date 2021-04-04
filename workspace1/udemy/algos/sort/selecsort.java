package sort;

public class selecsort {
public static void main(String[] args)
{
	int[] arr=procedureee(new int[] {9,8,3,13,87,12,99});
	for( int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}
public static int [] procedureee(int a[])
{
	for(int i=0;i<a.length;i++)
	{
		int min=i;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[j]<a[min])
			{
				min=j;
			}
		}
		int temp=a[i];
		a[i]=a[min];
		a[min]=temp;
		
	}
	return a;
}
}
