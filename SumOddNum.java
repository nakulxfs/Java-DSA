import java.util.Scanner;

public class SumOddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        oddSum(num);
    }
    public static void oddSum(int num){
        int sum = 0;
        int i = 1;
        while(i<=num){
            sum+=i;
            i+=2;
        }
        System.out.println(sum);
    }
}
