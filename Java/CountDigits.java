// Take a number as input and count how many digits it contains.

// Example:

// Input: 58392
// Output: 5 digits

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a = sc.nextInt();

        int count =0;
        if(a ==0){
            count =1;
        } else{
            a = Math.abs(a);

            for(;a>0;a=a/10){
                count++;
            }
        }
        System.out.println("This number contains: " + count + " Digits" );

        sc.close();
    }
}
