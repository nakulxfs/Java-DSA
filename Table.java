import java.util.Scanner;

public class Table {
    public static void main (String args[]) {
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        num(n);

    }
    public static void num(int n){
        for(int i=0; i<10; i++) {
            System.out.println(i * n);
        }
    }
}
