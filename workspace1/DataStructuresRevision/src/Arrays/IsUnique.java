package Arrays;

public class IsUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isUnique("mona"));
	}

	private static boolean isUnique(String str) {
		// TODO Auto-generated method stub
		boolean[] arr =new boolean[128];
		for(int i=0;i<str.length();i++)
		{
			if(arr[str.charAt(i)])
				return false;
			arr[str.charAt(i)]=true;
		}
		return true;
	}

}
