package learnJava.coding_Problem.basic_Math;

import java.util.Scanner;

public class P8_CheckPalindrome_SumOfDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no: ");
        int n=sc.nextInt();  // 11479
        int sum=0,r;
       while(n!=0){
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println(sum);
       int temp=sum;
       int rem,p=0;
       while (temp>0) {
        rem=temp%10;
        p=(p*10)+rem;
        temp=temp/10;
       }
       if(p==sum){
        System.out.println("Palindrome: -->"+ sum  );
       }
       else{
        System.out.println("Not palindrome");
       }





        sc.close();
    }
    
}
