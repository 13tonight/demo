package assignments.strings;

import java.util.Scanner;

public class CountOfLetters {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the letters: ");
        String newString = sc.next();
        char[] newStringChar = newString.toCharArray();
        int vowelsCount = 0;
        int consonantsCount = 0;

        for(char i : newStringChar){
            if( i == 'a' ||  i == 'e' || i == 'i' || i == 'o' || i == 'u'){
                vowelsCount++;
            }
            else {
                consonantsCount++;
            }
        }
        System.out.println("Vowels Count: " + vowelsCount + " Consonants Count: " +consonantsCount);
    }
}
