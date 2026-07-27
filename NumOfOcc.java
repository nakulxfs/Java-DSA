import java.util.Scanner;

public class NumOfOcc {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int size =  sc.nextInt();
            int[] arr = new int[size];
            for(int i = 0; i < size; i++){
                System.out.print("Enter the element "+(i+1)+" of the array: ");
                arr[i] = sc.nextInt();
            }
            int count = 0;
            for(int i = 0; i < arr.length-1; i++){
                for(int j = i+1; j < arr.length; j++){
                    if(arr[i]==arr[j]){
                        count++;
                    }
                }
            }
            System.out.println("Number of occurrences is "+count);
        }

}
