public class FloydTriangle {
    public static void main(String[] args) {
        Pattern();
    }
    public static void Pattern(){
        int count=1;
        for(int row = 0; row < 5; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(" "+count);
                count++;
            }
            System.out.println();
        }
    }
}
