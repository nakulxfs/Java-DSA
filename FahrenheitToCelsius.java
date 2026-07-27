import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double c = sc.nextDouble();
        double ci = c * 9 / 5 + 32;
    }
}
