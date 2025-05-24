import java.util.Scanner;

public class kisibilgisi {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String isim = scan.nextLine();
        System.out.println("Lütfen isminizi yazınız.");

        int yas = scan.nextInt();
        System.out.println("Lütfen yasınızı giriniz.");

        System.out.println("Selam"+ isim + "yaşım"+ yas);

        scan.close();
    }
}
