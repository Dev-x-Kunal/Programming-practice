// Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
// 	1 : + (Addition) a + b
// 2 : - (Subtraction) a - b
// 3 : * (Multiplication) a * b
// 4 : / (Division) a / b
// 5 : % (Modulo or remainder) a % b
// Calculate the result according to the operation given and display it to the user.

import java.util.Scanner;

public class basiccalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // double a = sc.nextDouble();
        // double b= sc.nextDouble();
        int n = sc.nextInt();
        if (n==1){
           double a = sc.nextDouble();
           double b= sc.nextDouble();
           double Addition = a + b;
           System.out.println("The Addition of two: " + Addition);
        } else if (n==2){
           double a = sc.nextDouble();
           double b= sc.nextDouble();
           double Subtraction = a - b;
           System.out.println("The Subtraction of two: " + Subtraction);
        } else if (n==3){
           double a = sc.nextDouble();
           double b= sc.nextDouble();
           double Multiplication = a * b;
           System.out.println("The Multiplication of two: " + Multiplication);
        } else if (n==4){
           double a = sc.nextDouble();
           double b= sc.nextDouble();
           double Division =  a / b;
           System.out.println("The Division of two: " + Division);
        } else if (n==5){
           double a = sc.nextDouble();
           double b= sc.nextDouble();
           double Modulo = a % b;
           System.out.println("The Modulo of two: " + Modulo);
        } else {
            System.out.println("Invalid Input!!");
        }
    }
}
