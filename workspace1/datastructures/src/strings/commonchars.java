package strings;



import java.util.Arrays;

public class commonchars {
public static void main (String args []) {
    String a="geeks";
    String b="forgeeks";
    String c="";
     for (int i = 0; i < a.length(); i++){

          char ch = a.charAt(i);
          if (b.indexOf(ch) != -1){
             c = c+String.valueOf(ch);
             }
          }
     char[] k= c.toCharArray();
     Arrays.sort(k);
     new String(k);
     System.out.print(k);
}
}