import java.util.ArrayList;

public class Sehirler {
 public static void main (String[] args){
        //Arraylisti önce new ile class yapıyoruz.ArrayList<String-Integer>gibi dolduruyoruz.
     ArrayList<String> cities= new ArrayList<>();
     cities.add("İzmir");
     cities.add("Ankara");
     cities.add("İstanbul");
     for (int i=0; i< cities.size(); i++){
         System.out.println(cities.get(i));
     }


    }
}
