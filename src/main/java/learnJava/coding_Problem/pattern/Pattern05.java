package learnJava.coding_Problem.pattern;
/* 
Input Format: N = 3
Result: 
1
2 2 
3 3 3 
*/
import java.util.Scanner;

public class Pattern05 {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for (int i = 1 ;i<=n;i++) {
            for(int j=1;j<=i;j++){
            System.out.print(i+ " ");
            }
            System.out.println();
        }
       
        sc.close();
    }
    
}
