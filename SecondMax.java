package Arrays;

import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int x: arr){
            if(max<x){
                max2=max;
                max=x;
            } 
            else if(max2<x && x!=max){
                max2=x;
            }   
        }  
        System.out.printf("Second Max: %d",max2);

        
    }
    
}
