import java.util.Scanner;

class EvenOddTernary {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = input.nextInt();
    EvenOddTernary obj = new EvenOddTernary();
    boolean check = obj.evenOdd(num);
    if(check){
        System.out.println("The number is even");
    }
    else{
        System.out.println("The number is odd");
    }
    }
    boolean evenOdd(int num){
        return num%2==0? true : false;
    }

}
