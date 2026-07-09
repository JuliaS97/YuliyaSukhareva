import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {

        // Sade kalkulyator menusu
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("==== Kalkulyator Menusu ====");
            System.out.println("1) Cem");
            System.out.println("2) Ferq");
            System.out.println("3) Hasil");
            System.out.println("4) Bolme");
            System.out.println("0) Cixis");
            System.out.println("============================");
            System.out.print("Secim edin: ");

            int secim = sc.nextInt();

            if (secim == 0) {
                System.out.println("Proqramdan cixildi. Sagolun!");
                break;
            }

            if (secim < 1 || secim > 4) {
                System.out.println("Yanlis secim! Yeniden cehd edin.");
                continue;
            }

            System.out.print("Birinci eded: ");
            double a = sc.nextDouble();

            System.out.print("Ikinci eded: ");
            double b = sc.nextDouble();

            switch (secim) {
                case 1:
                    System.out.printf("Netice: %.2f + %.2f = %.2f%n", a, b, a + b);
                    break;
                case 2:
                    System.out.printf("Netice: %.2f - %.2f = %.2f%n", a, b, a - b);
                    break;
                case 3:
                    System.out.printf("Netice: %.2f * %.2f = %.2f%n", a, b, a * b);
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("Xeta: 0-a bolmek olmaz!");
                    } else {
                        System.out.printf("Netice: %.2f / %.2f = %.2f%n", a, b, a / b);
                    }
                    break;
            }
            System.out.println("----------------------------");
        }

        sc.close();
    }
}