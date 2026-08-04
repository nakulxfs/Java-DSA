package Arrays;
import java.util.Scanner;
public class CountElementa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int i = 0;
        int j = 0;
        int k = 0;
        for(int x : arr){
            if(x<0){
                i++;
            }
            else if(x>0){
                j++;
            }
            else{
                k++;
            }
        }
        System.out.println("Negative: "+i+" Positive: "+j+" Zero: "+k);
    }
    
}
