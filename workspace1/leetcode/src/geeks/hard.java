package geeks;

import java.io.*;

class hard {
	
        
        static boolean isVowel(char ch) {
                return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
        }
        
        static int findComplexityOfSentence(String input) {
                
                if(null == input || input.trim().isEmpty()) {
                       return 0;
                }
                
                String[] words = input.split("\\s+");
                int easyWords = 0, hardWords = 0;
                
                for (int index = 0; index < words.length; index++) {
                        int consecutiveCount = 0, noOfConsonants = 0, noOfVowels = 0;
                        for (int jndex = 0; jndex < words[index].length(); jndex++) {
                                if (isVowel(words[index].toLowerCase().charAt(jndex))) {
                                        consecutiveCount++;
                                        noOfVowels++;
                                        if (consecutiveCount == 4) {
                                                hardWords++;
                                                noOfConsonants = 0;
                                                noOfVowels = 0;
                                                break;
                                        }
                                } else {
                                        noOfConsonants++;
                                        consecutiveCount = 0;
                                }
                        }

                        if (noOfConsonants > noOfVowels) {
                                hardWords++;
                        } else {
                                easyWords++;
                        }
                }
                
                return 5*hardWords+3*easyWords;
        }
        
        public static void main(String args[]) {
                
                String input = "Difficulty of sentence";
                System.out.println("Output "+findComplexityOfSentence(input));
        }


}