import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        // En cox qol vuran oyuncunu tap
        Scanner sc = new Scanner(System.in);

        int enCoxQol = -1;
        int enYaxsiOyuncu = -1;

        System.out.println("==== Futbol Matc Neticeleri ====");

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "-ci oyuncunun qol sayi: ");
            int qol = sc.nextInt();

            if (qol > enCoxQol) {
                enCoxQol = qol;
                enYaxsiOyuncu = i;
            }
        }

        System.out.println("================================");
        System.out.println("En yaxsi oyuncu: " + enYaxsiOyuncu + "-ci oyuncu");
        System.out.println("Qol sayi:        " + enCoxQol);

        sc.close();
    }
}