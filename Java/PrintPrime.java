// Take N as input and print all prime numbers from 1 to N.

import java.util.Scanner;

public class PrintPrime{
   public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter N: ");
    int N= sc.nextInt();
    for (int i =2;i<=N;i++){
        boolean IsPrime=true;
        for (int j=2; j<i;j++){
            if (i%j==0){
                IsPrime=false;
                break;
            }
        }
        if(IsPrime){
            System.out.println(i);
        }
        
    }
   }
}
