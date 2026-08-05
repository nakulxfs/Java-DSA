package Arrays;
import java.util.Scanner;
public class CountEvenOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<arr.length; i++){
            System.out.printf("Enter element %d: ",i+1 );
            arr[i]=sc.nextInt();
        }
        int evenCount=0;
        int oddCount=0;
        for(int x: arr){
            if(x%2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.printf("Even Count: %d %nOdd Count: %d",evenCount,oddCount);
    }
}

    
