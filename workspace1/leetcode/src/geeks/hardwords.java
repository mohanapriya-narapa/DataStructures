package geeks;

public class hardwords {

	public static void main(String[] args) {
String str="difficulty of sentence";
String strArray[] = str.split("\\s+");int count1=0,count2=0;
for(int i=0;i<str.length();i++){
	 int conti = 0, cons= 0, vows= 0;

	for (int j = 0; j < strArray[i].length(); j++) {
   // System.out.println(strArray[i]); 
	if(isVowel(strArray[i].toLowerCase().charAt(j)))
	{vows++; conti++;
    vows++;
    if (cons== 4) {
            count1++;
            cons= 0;
            vows= 0;
            break;
    }
	}
	else
	{
		cons++;conti=0;
	}
	
	}
     if (cons > vows) {
         count1++;
 } else {
         count2++;
 }}
System.out.println(5*count1+3*count2);}
public static boolean isVowel(char ch)
{
    return ( ch == 'a' || ch == 'e' ||
             ch == 'i' || ch == 'o' ||
             ch == 'u');
}
  
	
}
	
