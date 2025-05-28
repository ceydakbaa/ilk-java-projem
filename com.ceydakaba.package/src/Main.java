//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Vehicle vehicle= new Vehicle(65,"Renault","white");
    Car car = new Car(65,"Renault","white",2020);
    System.out.println(car.getSpeed());
    }
}