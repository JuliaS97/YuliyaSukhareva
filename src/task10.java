import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {

        // Bank menusu
        Scanner sc = new Scanner(System.in);

        // Menuyu cap et
        System.out.println("Bank Menusu");
        System.out.println("1 - Balans yoxla");
        System.out.println("2 - Pul yatir");
        System.out.println("3 - Pul cixar");
        System.out.println("4 - Cixis");
        System.out.print("Secim edin (1-4): ");

        int secim = sc.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Balansınız: 1250 AZN");
                break;
            case 2:
                System.out.println("Pul uğurla yatırıldı.");
                break;
            case 3:
                System.out.println("Pul uğurla çıxarıldı.");
                break;
            case 4:
                System.out.println("Sistemdən çıxış edildi. Sağolun!");
                break;
            default:
                System.out.println("Yanlis secim!");
        }

        sc.close();
    }
}