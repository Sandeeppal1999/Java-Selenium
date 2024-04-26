package learnJava.coding_Problem.basic_Math;
/* Java Program to count vowels in a string */

import java.util.Scanner;

public class P5_Count_vowels {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        int c=0;
        for(char ch: s.toCharArray()){
            ch = Character.toLowerCase(ch);
           if(ch=='a'|| ch=='i' || ch=='e'|| ch=='o'|| ch=='u'){
            c++;
           }
            
        }
        System.out.println("No of charcter in string : "+ c);

        sc.close();
    }
    
}
