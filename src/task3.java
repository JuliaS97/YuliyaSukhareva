import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        // Kassa qaliqi - emeliyyatlari izle
        Scanner sc = new Scanner(System.in);

        System.out.print("Ilkin balansi daxil edin (AZN): ");
        double balans = sc.nextDouble();

        System.out.println("Kassa Emeliyyatlari");
        System.out.printf("Baslanqic balans: %.2f AZN%n", balans);
        System.out.println("(musbet = medaxil, menfi = mexaric, 0 = dayandır)");

        int emeliyyatSayi = 0;

        while (true) {
            System.out.print("Meblegi daxil edin: ");
            double mebleg = sc.nextDouble();

            if (mebleg == 0) {
                System.out.println("Emeliyyat dayandırildi.");
                break;
            }

            balans += mebleg;
            emeliyyatSayi++;

            if (mebleg > 0) {
                System.out.printf("Medaxil: +%.2f AZN%n", mebleg);
            } else {
                System.out.printf("Mexaric: %.2f AZN%n", mebleg);
            }

            System.out.printf("Cari balans: %.2f AZN%n", balans);

            if (balans < 0) {
                System.out.println("XEBERDARLIQ: Balans menfiye dusdu!");
            }


        }

        System.out.println("Yekun Hesabat");
        System.out.println("Emeliyyat sayi: " + emeliyyatSayi);
        System.out.printf("Son balans: %.2f AZN%n", balans);

        sc.close();
    }
}