import javax.swing.*;

public class notortalaması {
    public static void main(String[] args) {
        int not = 63;
        String Harfnotu;

        switch (not) {
            case 100:
            case 95:
            case 90:
                Harfnotu = "A";
                break;
            case 89:
            case 85:
            case 80:
                Harfnotu = "B";
                break;
            case 79:
            case 75:
            case 70:
                Harfnotu = "C";
                break;
            case 69:
            case 65:
            case 63:
            case 60:
                Harfnotu = "D";
                break;
            case 50:
            case 40:
            case 30:
            case 20:
            case 10:
                Harfnotu = "F";
                break;
            default:
                Harfnotu = "Geçersiz";
        }
        System.out.println("Not" + not);
        System.out.println("Not"+Harfnotu);
    }
}
