package learnJava.coding_Problem.basic_Math;
/* Java Program to count letters in a String */

import java.util.Scanner;

public class P4_Count_no_of_letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        int c=0;
        for(int i=0;i<s.length();i++){
            if (Character.isLetter(s.charAt(i))) {
                System.out.println("character : "+ c + ":  " +s.charAt(i));
                c++; 
            }

        }
    }
    
}
