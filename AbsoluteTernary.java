import java.util.Scanner;

class AbsoluteTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        AbsoluteTernary obj =  new AbsoluteTernary();
        int abs = obj.absolute(num);
        System.out.println("MOD: "+abs);
    }
    int absolute(int num){
        return num>0? num : -num;
    }
}
