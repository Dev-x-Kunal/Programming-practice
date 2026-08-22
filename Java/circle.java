// Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.
import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Double r = sc.nextDouble();
        double a = 3.141 * r * r;
        System.out.println("The area of the Circle is:" +a);
    }
}
