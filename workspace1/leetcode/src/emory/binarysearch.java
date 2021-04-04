package emory;

public class binarysearch {

	public static void main(String[] args) {
	int[] arr=new int[]{1,3,5,6};
	int tar=3,mid=0;
	int low=0,high=arr.length-1;
	while(low<high)
	{
		 mid=(low+high)/2;
		if(arr[mid]==tar)
		{
			System.out.println(mid);break;
		}
		else if(arr[mid]>tar){
			high=mid-1;
		}
		else{
			low=mid+1;
		}
	}System.out.println(low);
	
	}

}
