public class AbcTriangle {
     public static void main(String[] args) {
         patten();
    }
    public static void patten(){
        for(int row = 0; row < 5; row++){
            char ch = 'A';
             for(int col = 0; col <=row; col++){
                 System.out.print(ch);
                 ch++;
             }
             System.out.println();
         }
    }
}
