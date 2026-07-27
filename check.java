import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows  = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print("arr["+i+"]["+j+"]= ");
                arr[i][j] = sc.nextInt();
            }
        }
        int largest = 0;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(arr[i][j] > largest) {
                    largest = arr[i][j];
                }
            }
        }
        System.out.println("largest: " + largest);
    }
}
