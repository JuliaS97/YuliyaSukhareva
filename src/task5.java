import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Widening - int -> double
        System.out.print("int daxil edin: ");
        int int1 = sc.nextInt();
        double widening = int1;
        System.out.println("Widening (int -> double): " + int1 + " -> " + widening);

        // Narrowing - double -> int
        System.out.print("double daxil edin: ");
        double double1 = sc.nextDouble();
        int narrowing = (int) double1; // el ile cast
        // (int) cast ondaliq hisseni yuvarlami - sadece kesir

        System.out.println("Narrowing (double -> int): " + double1 + " -> " + narrowing);

        sc.close();
    }
}