package Arrays;
import java.util.Scanner;
public class MaxElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        for(int x: arr){
            if(max<x){
                max=x;
            }

        }
        System.out.println(max);
    } 
    
}
