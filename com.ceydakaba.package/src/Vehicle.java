public class Vehicle {
    private int speed;
    private String brand;

    public int getSpeed(){
        return speed;
    }
    public void setSpeed(){
        this.speed= speed;
    }
    public Vehicle(int speed, String brand, String color){
        this.speed= speed;
        this.brand= brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(){
        this.brand= brand;
    }
}
