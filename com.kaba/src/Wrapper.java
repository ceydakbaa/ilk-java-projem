public class Wrapper {
    public static void main(String[] args){

        int a=8;

        //Integer olarak tanımlıyoruz.Bu autoboxing
        Integer number= a;

        // Unboxing kısmı
        int nnumber= number;

        System.out.println("Değer :"+ a);
        System.out.println("Yazılı Değer :"+number);
        System.out.println("Tekrar Değer :"+ nnumber);
    }
}
