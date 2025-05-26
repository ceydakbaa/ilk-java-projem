import java.util.Scanner;

public class atm {
    public static void main(String[] args){
        int bakiye = 3000, input,miktar;
        Scanner scan = new Scanner(System.in);

        System.out.println("Merhabar, Ceyda Bank'a Hoşgeldiniz");
        System.out.println("Güncel bakiyeniz :" + bakiye+ "TL");

        while (bakiye>0){
            System.out.println();
            System.out.println("1-) Para Yatır");
            System.out.println("2-) Para Çek");
            System.out.println("3-) Bakiye Sorgula");
            System.out.println("4-) Kart İade");
            input = scan.nextInt();

            if(input ==1){
                System.out.println("Yatırmak İstediğiniz Miktar:");
                miktar= scan.nextInt();
                bakiye+=miktar;
            } else if(input==2){
                System.out.println("Çekmek İstediğiniz Miktar:");
                miktar= scan.nextInt();
                if(miktar>bakiye){
                    System.out.println("Yetersiz Bakiye");
            }  else{
                    bakiye-= miktar;
                }
            } else if(input==3){
                System.out.println("Güncel Bakiyeniz"+ bakiye);
            } else if(input==4){
                System.out.println("Çıkış Yapılıyor");
                break;
            } else {
                System.out.println("Geçersiz Bir İşlem Yaptınız");
            }
        }
        System.out.println("Tekrar Bekleriz");
    }
}
