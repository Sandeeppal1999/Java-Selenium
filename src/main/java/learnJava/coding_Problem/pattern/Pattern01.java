package learnJava.coding_Problem.pattern;

import java.util.Scanner;

/* 
Input: N = 3
Output: 
* * *
* * *
* * * 
*/
public class Pattern01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" * ");
            }
               System.out.println();
        }
        sc.close();
    }   
}
