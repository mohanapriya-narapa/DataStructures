package interview;

public class increase {
public static void main(String args[])
{int[] arr=new int[] {1, 2, 3, 5, 4};
boolean isit=false;
	for(int i=0;i<arr.length-2;i++)
	{
		for(int j=1;j<arr.length-1;i++)
		{
			for(int k=2;k<arr.length;k++)
			{
				if((arr[i] < arr[j]) && (arr[j]< arr[k]) )
				{
					isit=true;
				}
					
			}
		}
	}if(isit)System.out.println("true");
}
}
