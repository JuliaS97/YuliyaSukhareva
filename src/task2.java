import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Kredit meblegi (AZN): ");
        double mebleg = sc.nextDouble();

        System.out.print("Illik faiz (%): ");
        double faiz = sc.nextDouble();

        System.out.print("Muddet (ay): ");
        int muddet = sc.nextInt();

        double umumiFaiz = mebleg * (faiz / 100);
        double umumiOdenis = mebleg + umumiFaiz;
        double ayliqOdenis = umumiOdenis / muddet;

        System.out.println("-Kredit Hesabati-");
        System.out.println("Mebleg: " + mebleg + " AZN");
        System.out.println("Illik faiz: " + faiz + "%");
        System.out.println("Muddet: " + muddet + " ay");
        System.out.println(" ");
        System.out.println("Umumi faiz: " + umumiFaiz + " AZN");
        System.out.println("Umumi odenis: " + umumiOdenis + " AZN");
        System.out.println("Ayliq odenis: " + ayliqOdenis + " AZN");
        System.out.println("=========================");

        sc.close();
    }
}