import java.util.Scanner;

public class InvertedNumTriangle {
    public static void main(String[] args) {
        pattern();
    }
    public static void pattern(){
        int n = 5;
        for (int row = 5; row > 0; row--) {
            for (int col = 1 ; col <= row; col++) {
                System.out.print(col);

            }
            System.out.println();
        }
    }
}
