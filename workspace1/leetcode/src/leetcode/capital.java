package leetcode;

public class capital {
	public boolean detectCapitalUse(String word) {
		int length = word.length();
		
		boolean isAllUpper = true;
        for(int i = 0; i < length && isAllUpper == true; i++)
        	if(Character.isLowerCase(word.charAt(i)))
        		isAllUpper = false;
        
        boolean isAllLower = true;
        for(int i = 0; i < length && isAllLower == true; i++)
        	if(Character.isUpperCase(word.charAt(i)))
        		isAllLower = false;
        
        boolean isCamelNotation = Character.isUpperCase(word.charAt(0));
        for(int i = 1; i < length && isCamelNotation == true; i++)
        	if(Character.isUpperCase(word.charAt(i)))
        		isCamelNotation = false;
        
        return isAllUpper || isAllLower || isCamelNotation;
    }

	public static void main(String[] args) {
		capital s = new capital();
		System.out.println(s.detectCapitalUse("Leetcode"));
	}
}