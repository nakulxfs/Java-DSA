import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter operator: ");
        char operator = input.next().charAt(0);
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        Calculator obj = new Calculator();
        int result = obj.calc(operator, num1, num2);
        System.out.print("The result is: "+result);

    }
    int calc(char op, int num1, int num2) {

        int output = switch(op){
            case '+' -> addition(num1,num2);
            case '-' -> subtraction(num1,num2);
            case '*' -> multiplication(num1,num2);
            case '/' -> division(num1,num2);
            default -> 0;
        };
        return output;
    }
    int addition(int num1, int num2) {
        return num1 + num2;
    }
    int subtraction(int num1, int num2) {
        return num1 - num2;
    }
    int multiplication(int num1, int num2) {
        return num1 * num2;
    }
    int division(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
        return num1 / num2;
    }
}


