public class Car {

    String name;
    String color;
    String model;

    public Car(String name, String color, String model){
        this.name = name;
        this.color = color;
        this.model = model;
    }

    @Override
    public String toString() {
        return String.format("Car Details: %nname: %s %nColor: %s %nModel: %s", name, color, model);
    }

    public static void main(String[] args) {
        Car car = new Car("BMW", "Red", "M5");
        System.out.println(car);

        Car car2 = new Car("Audi", "Black", "A5");
        System.out.println(car2);
    }
    
}