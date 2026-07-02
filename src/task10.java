import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ad-Soyad daxil edin: ");
        String adSoyad = sc.nextLine().trim();

        System.out.print("Yas daxil edin: ");
        int yas = sc.nextInt();
        sc.nextLine();

        System.out.print("Illik gelir (AZN): ");
        String gelirStr = sc.nextLine().trim();
        double gelir = Double.parseDouble(gelirStr);

        // Yoxlamalar
        boolean adUygun = adSoyad.contains(" ") && adSoyad.length() >= 5;
        boolean yasUygun = yas >= 18 && yas <= 70;
        boolean gelirUygun = gelir >= 3000;
        boolean uygun = adUygun && yasUygun && gelirUygun;

        // Ad formatlama
        int bosluq = adSoyad.indexOf(" ");
        String ad = adSoyad.substring(0, bosluq);
        String soyad = adSoyad.substring(bosluq + 1);
        String formatliAd = ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase()
                + " "
                + soyad.substring(0, 1).toUpperCase() + soyad.substring(1).toLowerCase();

        System.out.printf("Ad-Soyad: %s%n", formatliAd.toUpperCase());
        System.out.printf("Yas: %d%n", yas);
        System.out.printf("Illik gelir: %.2f AZN%n", gelir);

        System.out.printf("Ad uygun: %b%n", adUygun);
        System.out.printf("Yas uygun: %b%n", yasUygun);
        System.out.printf("Gelir uygun: %b%n", gelirUygun);

        System.out.printf("Muraciet statusu: -> %s%n",
                uygun ? "TESDIQ EDILDI" : "IMTINA");

        sc.close();
    }
}