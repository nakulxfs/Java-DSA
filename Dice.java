public class Dice {
    public static void main(String[] args) {
        
        for(int i=0; i<6; i++){
            int dice = (int) (Math.random() * 6);
            System.out.println(dice);
        }
    }
}
