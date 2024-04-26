package learnJava.coding_Problem.leetCode;// problem 258: Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

import java.util.Scanner;
public class AddDigits{
public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
  System.out.print("Enter num:");
  int n= sc.nextInt();
  int r= addDigits(n);
  System.out.println("Result: "+r);
  sc.close();

 }
 public static int addDigits(int num) {
  if(num==0) return 0;
  return(num%9==0)?9:num%9;
 
 
}

}