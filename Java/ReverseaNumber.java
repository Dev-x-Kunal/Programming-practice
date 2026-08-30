// Take a number as input and print its reverse.
// Example:

// Input: 12345
// Output: 54321

import java.util.Scanner;

public class ReverseaNumber {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Numbers: ");

        int number = sc.nextInt();

        int result=0;
        int digit = 0;
        while (number>0) {
            digit = number%10;
            result = result * 10 + digit;
            number = number/10;
        }
        System.out.println("Reverse Number: " + result);
    }
}
