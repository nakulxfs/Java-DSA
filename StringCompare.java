import java.util.Scanner;
public class StringCompare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Str1:");
        String str1 = sc.nextLine();
        System.out.print("Enter Str2:");
        String str2 = sc.nextLine();
        if(str1.equals(str2)){
            System.out.println("str1 equals str2");
        }else{
                System.out.println("stfu");
            }

        }
    }