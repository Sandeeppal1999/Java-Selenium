package learnJava.coding_Problem.basic_Math;

import java.util.Scanner;

public class P2_Swap2_String {
    public static void main(String[] args) {
        System.out.println("*** Starting ***");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two String a, b");
        String a=sc.next();
        String b= sc.next();
        System.out.printf("Before swap string" +"A:"+a + " B:"+b);
        a=a.concat(b);
        b=a.substring(0, a.length()-b.length());
        a=a.substring(b.length());
        System.out.println();
         System.out.printf("After swap string:  " +"A:"+a + " B:"+b);
         sc.close();
    }
    
}
