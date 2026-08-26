// Take N as input and find the largest number between 1 and N that is divisible by 7.

import java.util.Scanner;

public class LargestNumberDivisibleby7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter A number: ");
        int N=sc.nextInt();
        int largest = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 7 == 0) {
                largest = i;
            }
        }
        System.out.println(largest);
        
    }
}
