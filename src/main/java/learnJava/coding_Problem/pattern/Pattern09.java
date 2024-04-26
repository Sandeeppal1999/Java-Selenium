package learnJava.coding_Problem.pattern;

import java.util.Scanner;

public class Pattern09 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for(int i=n-1;i>=0;i--){
            //space
            for(int j=n-i-1;j>0;j--){
                System.out.print(" ");
            }
            // star
            for(int k=2*i+1;k>0;k--){
                System.out.print("*");
            }
        
            // space
            for(int j=n-i-1;j>=0;j--){
                System.out.print(" ");
            }
            System.out.println();
        }
       
        sc.close();
    }
    
}
