import java.util.Scanner;

    public class PrimeCheck {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            if(num<=1){
                System.out.println("Not Prime");
            }
            for (int i = 2; i < num; i++) {
                if(num%i==0){
                    System.out.println("Not a Prime Number");
                    return;
                }
            }
            System.out.print("Prime");

        }
    }


