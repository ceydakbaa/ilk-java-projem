//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        int result1= calculator.add(8,9);
        System.out.println("Toplam:"+result1);
        int result2= calculator.add(10,11,12);
        System.out.println("Toplam:"+result2);

    }
}