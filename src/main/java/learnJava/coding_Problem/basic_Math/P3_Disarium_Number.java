package learnJava.coding_Problem.basic_Math;

import java.util.Scanner;

class P3_Disarium{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no testcase");
        int t= sc.nextInt();
        while(t-- >0){
            System.out.println("Enter num: ");
            int N=sc.nextInt();
            System.out.println(solution.isDisarium(N));

        }
        sc.close();
    }

}

class solution {
     static int isDisarium(int N){
        int count=0, sum=0;
         int k=N;
        while(k!=0){
            count++;
            k/=10;
        }
        k=N;
         while(k!=0){
             sum+= Math.pow((k%10),count--);
             k=k/10;
         }
         if (sum == N){
            System.out.println(" NUm is disarium "+ N);
             return 1;
         }
         else{
             System.out.println(" NUm is not  disarium "+ N);
             return 0;
         }
        
    }
}