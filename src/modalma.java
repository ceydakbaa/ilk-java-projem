import java.util.Scanner;

public class modalma {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("sayı gir:");
        int number= scan.nextInt();

        if(number %2==0){
            System.out.println("sayı çifttir.");
        } else {
            System.out.println("sayı tektir.");
        }
    }
}
