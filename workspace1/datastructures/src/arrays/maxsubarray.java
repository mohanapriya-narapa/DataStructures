package arrays;

public class maxsubarray {

	public static void main(String[] args) {
	int[] A=new int[] {-2,1,-3,4,-1,2,1,-5,4};
	int sum=0;
	int max=Integer.MIN_VALUE;
	for(int i=0;i<A.length;i++)
	{
		if(sum<A[0])
		{
			sum=A[i];
		}
		else{
			sum+=A[i];
		}if(sum>max)max=sum;
	}System.out.println(max);
	}

}
