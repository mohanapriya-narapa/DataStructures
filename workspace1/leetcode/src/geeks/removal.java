package geeks;

public class removal {

	public static void main(String[] args) {
		String str="This is demo string";int count=0;int i;
		 for ( i = 0; i < str.length(); i++) {
		      
			 if(str.charAt(i)=='i'){count++;
	        }	
			 if(count==2)
				// System.out.println(str.substring(i + 1));
			 break;
		 }System.out.println(str.substring(i + 1));
	}

}
