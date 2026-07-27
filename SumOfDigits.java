import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        sumOfDigits(n);
    }
    public static void sumOfDigits(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            int digit = num%10;
            sum += digit;
            num=num/ 10;
        }
        System.out.println(sum);

    }
}
