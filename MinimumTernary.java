import javax.swing.plaf.metal.MetalInternalFrameUI;
import java.util.Scanner;

class MinimumTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter second number: ");
        int num2 = input.nextInt();
        MinimumTernary minimum = new MinimumTernary();
        int min = minimum.min(num1, num2);
        System.out.println("Minimum: "+ min);
    }
    int min(int num1, int num2) {
        return num1>num2?num2:num1;
    }

}
