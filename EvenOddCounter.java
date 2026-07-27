import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                System.out.print("arr["+i+"]["+j+"]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        int evenCount = 0;
        int oddCount = 0;
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(arr[i][j]%2==0){
                    evenCount++;
                }
                else{
                    oddCount++;
                }

            }
        }
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);
    }
}
