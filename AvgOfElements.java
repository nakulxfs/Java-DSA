package Arrays;
import java.util.Scanner;
public class AvgOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int x: arr){
            sum += x;
        }
        System.out.println(sum/arr.length);
        sc.close();
    }   
}
