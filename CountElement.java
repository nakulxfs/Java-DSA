package Arrays;
import java.util.Scanner;
public class CountElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the value of K: ");
        int k = sc.nextInt();
        for(int i=0; i<size; i++){
            System.out.printf("Enter element %d:",i+1);
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int x: arr){
            if(x==k){
                count++;
            }
        }
        System.out.println(count);
        sc.close();

        

        
    }
    
}

    

