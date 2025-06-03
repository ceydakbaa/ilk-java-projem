import java.util.Scanner;

public class Divide {
    public static void main(String [] args){
        Scanner scan= new Scanner(System.in);

        try{
            //Hatanın olacağı deneme kısmını buraya yazıyoruz.
            System.out.println("Lütfen bir değer giriniz : ");
            int sayı1= scan.nextInt();

            System.out.println("Lütfen farklı bir değer giriniz : ");
            int sayı2= scan.nextInt();

            int sonuç=sayı1/sayı2;
            System.out.println("Sonuç : "+ sonuç);
        } catch (ArithmeticException e){
            System.out.println("Hata!! Sıfıra bölünemez!");
        } finally {
            scan.close();
        }
    }
}
