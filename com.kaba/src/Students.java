import java.util.HashMap;
import java.util.Map;

public class Students {
    public static void main(String[] args){
        Map<String, Integer> students= new HashMap<>();
        students.put("Mehmet", 75);
        students.put("Ayşe", 85);
        students.put("Ahmet",90);
        for(Map.Entry pairentry: students.entrySet()){
            System.out.println(pairentry.getKey()+ ":"+ pairentry.getValue());
        }
    }
}
