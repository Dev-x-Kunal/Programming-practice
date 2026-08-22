 //  Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
// If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
// If they enter 0 then stop.
// If he/ she scores :
// Marks >=90 -> print “This is Good”
// 89 >= Marks >= 60 -> print “This is also Good”
// 59 >= Marks >= 0 -> print “This is Good as well”
// 	Because marks don’t matter but our effort does.
// (Hint : use do-while loop but think & understand why)

import java.util.Scanner;

public class menudrivenprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;    
        do{
            System.out.print("Enter Your Choice 1(for input) & o(for exit): ");
            n = sc.nextInt();
            if(n == 1){
                System.out.print("Enter Your Marks: ");
                int Marks = sc.nextInt();
                if(Marks>=90){
                    System.out.println("This is Good");
                }else if(Marks >=60){
                     System.out.println("This is Also Good");
                }else if(Marks >=45){
                     System.out.println("This is Also a Good marks");
                }else{
                     System.out.println("This is Good as well");
                }
            }
        } while(n !=0);
        sc.close();
    }
    
}
