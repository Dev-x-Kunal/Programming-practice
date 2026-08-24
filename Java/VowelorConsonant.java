// Take a character as input and check whether it is a vowel or consonant.
import java.util.Scanner;

public class VowelorConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char a = sc.next().charAt(0);
        if(a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U' || a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'){
            System.out.println("This Character "+ a + " is Vowel");
        } else {
             System.out.println("This Character "+ a + " is Consonant");
        }
    }
}
