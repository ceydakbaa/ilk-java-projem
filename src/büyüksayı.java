import java.util.Scanner;

public class büyüksayı {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz:");
        int number1 = scan.nextInt();

        System.out.println("İkinci sayıyı giriniz:");
        int number2= scan.nextInt();

        System.out.println("Üçüncü sayıyı giriniz:");
        int number3= scan.nextInt();

        int enbüyüksayı = Math.max(number1, Math.max( number3 , number2));
        System.out.println("En Yüksek Sayı:"+enbüyüksayı);


    }
}
