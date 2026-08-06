import java.util.Scanner;

class GradeTernary {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Score Out of 100: ");
        int num = sc.nextInt();
        GradeTernary obj = new GradeTernary();
        String check = obj.grade(num);
        System.out.print("Grade: "+check);

    }
    String grade(int num){
        String check = num>80 ? "High":
                       num>=50 ? "Moderate":
                                "Low";

        return check;
    }
}
