import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        int Area = (int) (Math.PI * radius * radius);
        int Circumference = (int) (2 * Math.PI * radius);
        System.out.printf("Area of circle: %d %nCircumference of circle is: %d",Area,Circumference);
  
    }
    
}
