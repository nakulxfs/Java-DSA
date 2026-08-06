import java.util.Scanner;

public class PasswordChecker {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        int num = sc.nextInt();

        int pass = 2006;
        int check;
        do {
            System.out.print("Enter your password again: ");
            check = sc.nextInt();

        } while (num == pass);
        System.out.println("Your password is incorrect");
    }

}
