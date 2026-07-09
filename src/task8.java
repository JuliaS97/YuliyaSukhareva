import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {

        // Kinoteatr bileti qiymeti
        Scanner sc = new Scanner(System.in);

        System.out.print("Yasi daxil edin: ");
        int yas = sc.nextInt();

        double biletQiymeti;

        if (yas <= 7) {
            biletQiymeti = 0;
            System.out.println("Bilet qiymeti: Pulsuz");
        } else if (yas <= 17) {
            biletQiymeti = 3;
            System.out.println("Bilet qiymeti: 3 AZN");
        } else if (yas <= 64) {
            biletQiymeti = 7;
            System.out.println("Bilet qiymeti: 7 AZN");
        } else {
            biletQiymeti = 4;
            System.out.println("Bilet qiymeti: 4 AZN");
        }

        System.out.print("Nece bilet almaq isteyirsiniz? ");
        int biletSayi = sc.nextInt();

        double umumiMebleg = biletQiymeti * biletSayi;

        System.out.println("Bilet Hesabati");
        System.out.println("Bilet sayi:    " + biletSayi);
        System.out.printf("Bilet qiymeti: %.2f AZN%n", biletQiymeti);
        System.out.printf("Umumi mebleg:  %.2f AZN%n", umumiMebleg);

        sc.close();
    }
}