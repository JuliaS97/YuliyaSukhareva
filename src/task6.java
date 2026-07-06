import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        // Sade kalkulyator
        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci eded: ");
        double sayi1 = sc.nextDouble();

        System.out.print("Emeliyyat isaresi (+, -, *, /): ");
        String isare = sc.next();

        System.out.print("Ikinci eded: ");
        double sayi2 = sc.nextDouble();

        System.out.print("Netice: " + sayi1 + " " + isare + " " + sayi2 + " = ");

        switch (isare) {
            case "+":
                System.out.println(sayi1 + sayi2);
                break;
            case "-":
                System.out.println(sayi1 - sayi2);
                break;
            case "*":
                System.out.println(sayi1 * sayi2);
                break;
            case "/":
                if (sayi2 == 0) {
                    System.out.println("0-a bolmek olmaz!");
                } else {
                    System.out.println(sayi1 / sayi2);
                }
                break;
            default:
                System.out.println("Namelum isare!");
        }

        sc.close();
    }
}