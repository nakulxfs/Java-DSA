import java.util.Scanner;
public class Stringlen {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==' ')
                count++;
    }
    System.out.printf("No. of words in a sentence: %d", count+1);
    
  }
}
