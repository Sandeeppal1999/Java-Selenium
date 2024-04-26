package learnJava.coding_Problem.pattern;

import java.util.Scanner;

/* Input Format: N = 3
Result: 
1 2 3
1 2
1 */
public class Pattern07 {
public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for (int i = 1 ;i<=n;i++) {
            for(int j=1;j<=n-i+1;j++){
            System.out.print(j+" ");
            }
            System.out.println();
        }
       
        sc.close();
    }
    
    
}
