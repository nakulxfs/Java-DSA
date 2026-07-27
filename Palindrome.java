import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        checkPalindrome(num);

    }
    public static void checkPalindrome(int num) {
        int temp = num;
        int rev  = 0;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }
        if (rev == num) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
