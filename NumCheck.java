import java.util.Scanner;

public class NumCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0){
            System.out.println("Num is positive");
        } else if (n<0){
            System.out.println("Num is negative");
        }
        else{
            System.out.println("Num is zero");
        }
    }
}
