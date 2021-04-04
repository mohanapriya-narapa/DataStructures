package geeks;

public class capitaltosmall {

	public static void main(String[] args) {
	String strr="WeAreGood";
	 char[] str=strr.toCharArray();
	 for(int i=0;i<str.length;i++)
	 {
		 if (str[i]>='A' && str[i]<='Z')
         {
             str[i] = (char)((int)str[i]+32);
             if (i != 0)
                 System.out.print(" ");
             System.out.print(str[i]);
         }
		 else
	            System.out.print(str[i]);
	 }
	 
	}

}
