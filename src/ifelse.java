import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi gir");
        int number= scan.nextInt();
        if(number>0){
            System.out.println("sayı pozitiftir.");
        }
        else if(number<0){
            System.out.println("sayı negatiftir.");
        } else {
            System.out.println("sayı sıfırdır.");
        }


    }
}
