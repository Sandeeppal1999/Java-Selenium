package learnJava.coding_Problem.pattern;

import java.util.Scanner;

/* Input Format: N = 6
Result:
* * * * * *
* * * * * 
* * * * 
* * * 
* * 
*  */
public class Pattern06 {
         public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for (int i = 0 ;i<n;i++) {
            for(int j=0;j<n-i;j++){
            System.out.print(" * ");
            }
            System.out.println();
        }
       
        sc.close();
    }
    
}
