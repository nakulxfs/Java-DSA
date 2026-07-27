public class RepNumPattern {
    public static void main(String[] args) {
        pattern();
    }
    public static void pattern(){
        int n = 5;
        for(int row = 1; row<=n; row++ ){
            for(int col=1; col<=row; col++){
                System.out.print(row);
            }
            System.out.println();
        }
    }
}
