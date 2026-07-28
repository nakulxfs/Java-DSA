import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial = fact(num);
        System.out.println("Factorial is " + factorial);

    }
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return fact(n-1)*n;
    }
}
