import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int percent = sc.nextInt();
        if(percent >= 90 && percent <= 100){
            System.out.println("A");
        }else if(percent >= 75 && percent <= 90){
            System.out.println("B");
        }else if(percent >= 60 && percent <= 75){
            System.out.println("C");
        }else if(percent >= 30 && percent <= 60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }

    }
}
