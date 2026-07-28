import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        do {
            System.out.print("Enter a number: ");
            num = sc.nextInt();
        }
        while (num > 100 || num < 0);
        System.out.print("Your number is: " + num);

    }
}
