import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int original = num;
        int len = (int) Math.log10(num) + 1;
        int sum = 0;
        while(num>0){
            int digit = num%10;
            sum += (int) Math.pow(digit,len);
            num = num/10;
        }
        boolean result = original==sum?true:false;
        if(result){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not an Armstrong");
        }
    }
}
