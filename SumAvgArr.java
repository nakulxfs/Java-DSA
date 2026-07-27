import java.util.Scanner;

public class SumAvgArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size =  sc.nextInt();
        int[] arr = new int[size];
     for(int i = 0; i < size; i++){
         System.out.print("Enter the element "+(i+1)+" of the array: ");
         arr[i] = sc.nextInt();
        }
     int sum =0;
     for(int i = 0; i < size; i++){
         sum+=arr[i];
     }
     int avg = sum/size;
     System.out.println("Average is "+avg);
     System.out.println("Sum is "+sum );
    }
}
