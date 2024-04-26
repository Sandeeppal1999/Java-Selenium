package learnJava.coding_Problem.pattern;

import java.util.Scanner;

public class Pattern11 {
      public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for(int i=0;i<=2*n-1;i++){
            int star=i;
            if(i>n) star=2*n-i;
            for(int j=0;j<=star;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }

      }
    
}
