package learnJava.coding_Problem.basic_Math;

import java.util.Scanner;

/**
 * Swap-two-num-without-using-third-variable
 * method 01: using third variablee
 * ;
 */
public class P1_Swap_Two_Num{
    public static void main(String[] args) {
        System.out.println("*** Starting ***");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two interger a, b");
        int a = sc.nextInt();
        int b=sc.nextInt();
        System.out.printf("Before  " +"A:"+a + " B:"+b);
        /* Method 01
        int t;
        t=a;
        a=b;
        b=t; */

        // Method 02
        
       /*  a=a+b;
        b=a-b;
        a=a-b; */

        // Method 03 num should be greater than zero;
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println();
        System.out.printf("After swap: " +"A:"+a + " B:"+b);
        sc.close();
    }
}