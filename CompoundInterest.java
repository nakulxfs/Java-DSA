import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        float r = sc.nextInt();
        int t = sc.nextInt();
        double ci = p * Math.pow((1 + r / 100), t);
        System.out.println("Simple Interest: " + ci);

    }
}
