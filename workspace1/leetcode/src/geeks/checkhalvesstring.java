package geeks;

public class checkhalvesstring {

	public static void main(String[] args) {
		String s="abccab";
	int MAX_CHAR = 26;
		 int[] count=new int[26];
		    int n = s.length();
		    if (n == 1)
		     System.out.println("true");
		    //take note of this priya
		   //we use this kind of loop to traverse till the middle element reached
		    for (int i=0,j=n-1; i<j; i++,j--) //imp_one
		    {
		        // First half
		        count[s.charAt(i)-'a']++;
		 
		        // Second half
		        count[s.charAt(j)-'a']--;
		    }
		    for (int i = 0; i<MAX_CHAR; i++)
		        if (count[i] != 0){
		            System.out.println("false");}
		            
		    System.out.println("true");
		}
	}


