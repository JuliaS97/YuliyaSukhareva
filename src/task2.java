import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        // 10 telebenin orta balini hesabla
        Scanner sc = new Scanner(System.in);

        int cem = 0;
        int telebeSayi = 10;

        for (int i = 1; i <= telebeSayi; i++) {
            System.out.print(i + "-ci telebenin bali: ");
            int bal = sc.nextInt();
            cem += bal;
        }

        double ortaBal = (double) cem / telebeSayi;

        System.out.println("Sinif Hesabati");
        System.out.println("Cem bal: " + cem);
        System.out.printf("Orta bal: %.2f%n", ortaBal);

        if (ortaBal > 70) {
            System.out.println("Sinif ugurludur!");
        } else {
            System.out.println("Elave ise ehtiyac var.");
        }


        sc.close();
    }
}