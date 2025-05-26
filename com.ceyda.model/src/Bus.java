public class Bus {
    private String brand;
    private int year;
    private String model;

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
         this.brand=brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void print(){
        System.out.println("Brand:"+ brand);
        System.out.println("Year:"+ year);
        System.out.println("Model:"+ model);
    }
}