import java.util.Scanner;

public class LargestElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                arr[i][j] = sc.nextInt();
            }
        }
        int smallest = arr[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] < smallest) {
                    smallest = arr[i][j];
                }
            }
        }
        System.out.println("smallest: " + smallest);
    }
}
