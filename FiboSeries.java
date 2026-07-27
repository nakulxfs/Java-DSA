import java.util.Scanner;

public class FiboSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo(n);
    }
    public static void fibo(int num) {
        if (num < 0) {
            System.out.print("0");
        }
        if (num == 0) {
            return;
        }
        int first = 0;
        int second = 1;
        for (int i = 2; i <= num; i++) {
            int sum = first + second;
            System.out.print(sum + " ");
            first = second;
            second = sum;
        }


    }

}
