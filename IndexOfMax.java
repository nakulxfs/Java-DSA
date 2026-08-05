package Arrays;
import java.util.Scanner;

public class IndexOfMax {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<arr.length; i++){
            System.out.printf("Enter element %d:", i+1);
            arr[i]=sc.nextInt();
        }
        int max = arr[0];
        int index = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>arr[index]){
                index=i+1;
            }
        }

        System.out.printf("Index of Max: %d", index);
        
        

    }
    
}
