import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        checkPrime(num);
    }
    public static void checkPrime(int num) {
        if (num == 1) System.out.println("1");
        for (int i = 2; i  < num; i++) {
            if (num % i == 0) {
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("prime");


    }
}
