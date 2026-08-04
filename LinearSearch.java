package Arrays;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be searched: ");
        int target = sc.nextInt();
        for(int x: arr){
            if(target == x){
                System.out.println("Element found");
                return;
            }
        }
        System.out.println("Element not found");
        sc.close();
    }   
}
