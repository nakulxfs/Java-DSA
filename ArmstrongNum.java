import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        checkArmstrong(num);

    }
    public static void checkArmstrong(int num) {
        int original = num;
        int temp = num;
        int count=0;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        int sum = 0;
        while (num!=0) {
            int digit = num%10;
            sum +=  (int) Math.pow(digit, count);
            num = num/10;
        }
        if (sum == original) {
            System.out.println("Armstrong number");
        }
        else  {
            System.out.println("Not Armstrong number");
        }


    }
}
