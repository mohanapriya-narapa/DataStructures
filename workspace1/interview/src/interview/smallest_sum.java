package interview;

public class smallest_sum {

	public static void main(String[] args) {
	int[] arr=new int[]{8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1};
	boolean flag=false;
	for(int i=0;i<arr.length-1;i++)
	{
		
			if(arr[i]>arr[i+1])
			{
				flag=true;
				System.out.println(arr[i]);break;
			}
		
	}

	}

}
