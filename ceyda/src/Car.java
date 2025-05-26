public class Car {

    public String brand;
    public int year;
    public String model;
    public String color;
    public int kilometer;
    public String faultlog;

    public Car(String brand, int year, String model, String color, int kilometer, String faultlog){
                 this.brand=brand;
                 this.year=year;
                 this.model=model;
                 this.color=color;
                 this.kilometer=kilometer;
                 this.faultlog=faultlog ;
    }

    public void print (){
        System.out.println("BRAND:"+ brand);
        System.out.println("YEAR:"+ year);
        System.out.println("MODEL:"+model);
        System.out.println("COLOR:"+color);
        System.out.println("KİLOMETER:"+ kilometer);
        System.out.println("FAULTLOG"+faultlog);

    }
}
