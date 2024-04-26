package learnJava.coding_Problem.basic_Math;

import java.util.Scanner;

public class P7_Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str= sc.next();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev= rev+str.charAt(i); 
        }
        System.out.println("Revser string : "+ rev);
        sc.close();
    }
    
}
