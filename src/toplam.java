import java.util.Scanner;

public class toplam {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen pozitif bir değer giriniz:");
        int a = scan.nextInt();

        int toplam =0;
        for(int i= 1; i<a; i++){
            toplam += i;
        }
        System.out.println("1'den " + a + "'ye kadar olan sayıların toplamı: " + toplam);

    }
}
