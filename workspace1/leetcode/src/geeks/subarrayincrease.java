package geeks;

public class subarrayincrease {

	public static void main(String[] args) {
		int arr[]= new int[] {4,8,7,10,11};
		int  count=0,length=1;
		for (int i = 0; i < arr.length-1; ++i)
		{
			if(arr[i+1] > arr[i])
			{
				length++;
			}
			else
			{
				count = count + (length)*(length -1)/2;
				length = 1;
			}
		}  if (length > 1)
            count += (((length - 1) * length) / 2);
		System.out.println(count);;

	}

}
