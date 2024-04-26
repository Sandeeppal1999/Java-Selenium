package learnJava.coding_Problem.basic_Math;

import java.util.Scanner;

public class P6_ArmstrongNo {
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            int n=sc.nextInt();
            System.out.print("Enter num to find armstrong no :");
    
            for (int i = 0; i <=n; i++) {
                if (isArmstrongNumber(i)) {
                    System.out.println("Armstrong No: "+i  );
                }
            }
            sc.close();
        }
    
        // Function to check if a number is an Armstrong number
        private static boolean isArmstrongNumber(int number) {
            int originalNumber = number;
            int n = String.valueOf(number).length();
            int sum = 0;
    
            while (number > 0) {
                int digit = number % 10;
                sum += Math.pow(digit, n);
                number /= 10;
            }
    
            return sum == originalNumber;
        }
    }
    

    

