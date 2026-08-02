import java.util.Scanner;

public class AreaOfCircle {


    double radius; 


    AreaOfCircle(double radius){
        this.radius = radius;
    }

    double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    double getCircumference(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Area of Circle: %.2f %nCircumference of Circle: %.2f", getArea(), getCircumference());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        AreaOfCircle circle = new AreaOfCircle(radius);
        System.out.println(circle);
    }
    









    
}
