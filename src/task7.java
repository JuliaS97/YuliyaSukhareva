import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {

        // Kredit qarari - her serti ayrica yoxla
        Scanner sc = new Scanner(System.in);

        System.out.print("Yas daxil edin: ");
        int yas = sc.nextInt();

        System.out.print("Ayliq gelir (AZN): ");
        double gelir = sc.nextDouble();

        System.out.print("Kredit meblegi (AZN): ");
        double mebleg = sc.nextDouble();

        // Her serti ayrica yoxla
        if (yas < 21 || yas > 65) {
            System.out.println("Redd edildi: yas uygun deyil (21-65 olmalidir)");
        } else if (gelir <= 800) {
            System.out.println("Redd edildi: gelir uygun deyil (800 AZN-den cox olmalidir)");
        } else if (mebleg < 300 || mebleg > 50000) {
            System.out.println("Redd edildi: mebleg uygun deyil (300-50000 AZN arasinda olmalidir)");
        } else {
            System.out.println("TESDIQ EDILDI");
        }

        sc.close();
    }
}