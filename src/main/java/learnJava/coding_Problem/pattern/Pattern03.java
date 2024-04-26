package learnJava.coding_Problem.pattern;
/* 
N = 5
Output:
* ** *** **** ***** 
 */

import java.util.Scanner;

public class Pattern03 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for (int i = 0 ;i<n;i++) {
            for (int j =0;j<=i;j++){
              System.out.print("*");
            }
         System.out.print(" ");
        }
        /* for(int i = 1; i <= N; i++) {
            String str = "*";
            System.out.print(str.repeat(i)+" ");
        } */
        sc.close();
    }
    
}
