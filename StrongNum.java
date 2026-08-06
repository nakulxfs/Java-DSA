import java.util.Scanner;

public class StrongNum {
    public static int fact(int n){
        int fact  = 1;
        for (int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int original = n;
        int sum = 0;
        while(n!=0){
            int digit = n%10;
            sum += fact(digit);
            n=n/10;
        }
        if(original==sum){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}
