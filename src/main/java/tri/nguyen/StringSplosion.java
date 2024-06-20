package tri.nguyen;
/*
Warmup-2 stringSplosion
Link: https://codingbat.com/prob/p117334
Given a non-empty string like "Code" return a string like "CCoCodCode".


stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
 */

import java.util.Scanner;

public class StringSplosion {
    public static String stringSplosion(String str){
        String result = "";
        // On each iteration, add the substring of the chars 0..i
        for (int i = 0; i < str.length(); i++){
            result = result + str.substring(0, i+1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");

        String str = input.nextLine();
        System.out.println("Your string after modification: " + stringSplosion(str));

        input.close();


    }
}
