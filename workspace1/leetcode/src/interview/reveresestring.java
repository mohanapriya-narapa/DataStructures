package interview;

public class reveresestring {

	public static void main(String[] args) {
		String str="we are good";
		String strArray[] = str.split(" ");
		  for(int i=strArray.length-1; i >=0; i--){
              System.out.println(strArray[i]);
      }
	}

}

