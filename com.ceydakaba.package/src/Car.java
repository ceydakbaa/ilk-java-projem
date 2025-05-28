public class Car extends Vehicle {

    private int year;
    public Car(int speed, String brand, String color, int year) {
        super(speed, brand, color);
        this.year= year;
    }
}
