import java.util.HashSet;
import java.util.Set;

public class Fruits {
    public static void main(String[] args){
        //Hashset olayında Set<String>kullanıyoruz
        Set<String> Hashset = new HashSet<>();
        Hashset.add("Apple");
        Hashset.add("Banana");
        Hashset.add("Apple");
        Hashset.add("Cherry");
        //Burayı Berkan Hocaya soruyoruz çünkü arraylistteki for döngüsünü kullanmadık.
        for(String element:Hashset){
            System.out.println(element+" ");
        }
    }
}
