import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Celsius daxil edin: "); //33
        int c = sc.nextInt();

        // YANLIS - int/int = int, onluq hisse itir
        // 9/5 = 1 (1.8 deyil) -> netice yanlish cixir
        double yanlis = c * 9 / 5 + 32;

        // DUZGUN - 9.0/5 = 1.8 (double bolme)
        double duzgun = c * 9.0 / 5 + 32;

        System.out.println("Celsius -> Fahrenheit");
        System.out.println("Celsius: " + c + " C"); // 33C
        System.out.println("Yanlis: " + yanlis + " F"); //33*9/5+32=91F
        System.out.println("Duzgun: " + duzgun + " F"); //33*9.0/5+32=91.4F
        System.out.println("Ferq: " + (duzgun - yanlis)); // 91.4-91=0.4
        sc.close();
    }
}