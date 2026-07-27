import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();
        int c = a;
        a=b;
        b=c;

        System.out.println("After swapping A: " + a);
        System.out.println("After swapping B: " + b);
    }
}
