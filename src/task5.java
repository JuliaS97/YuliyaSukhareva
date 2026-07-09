import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        // Emanet meblegi 2 qatina catana qeder hesabla
        Scanner sc = new Scanner(System.in);

        System.out.print("Ilkin emanet meblegi (AZN): ");
        double ilkinMebleg = sc.nextDouble();

        System.out.print("Illik faiz derecesi: ");
        double faiz = sc.nextDouble();

        double movcudMebleg = ilkinMebleg;
        double hedef = ilkinMebleg * 2;
        int il = 0;

        System.out.println("-Faiz Artimi-");
        System.out.printf("Ilkin mebleg: %.2f AZN%n", ilkinMebleg);
        System.out.printf("Hedef (2 qat): %.2f AZN%n", hedef);
        System.out.println("--------------------");

        while (movcudMebleg < hedef) {
            movcudMebleg += movcudMebleg * (faiz / 100);
            il++;
            System.out.printf("%d-ci il: %.2f AZN%n", il, movcudMebleg);
        }

        System.out.println("--------------------");
        System.out.println("2 qata catmaq ucun: " + il + " il lazim oldu!");


        sc.close();
    }
}