import java.util.Scanner;

class MonthOfYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        int num = sc.nextInt();
        MonthOfYear obj = new MonthOfYear();
        String check = obj.month(num);
        System.out.print("Month of the Year based on (1-12): "+check);
    }
    String month(int num){
        String output = switch (num){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid";
        };
        return output;
    }
}
