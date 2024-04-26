package learnJava.coding_Problem.pattern;

import java.util.Scanner;

/* 
Input Format: N = 3
Result: 
  *  
 ***
***** 
*****  
 ***
  * 
   */
public class Pattern10 {
      public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for(int i=0; i<n;i++){
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //start
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            //space
             for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
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
    }
    
}
