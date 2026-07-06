import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {

        // BMI hesablama ve kateqoriya
        Scanner sc = new Scanner(System.in);

        System.out.print("Ceki daxil edin (kq): ");
        double ceki = sc.nextDouble();

        System.out.print("Boy daxil edin (metr, mes: 1.75): ");
        double boy = sc.nextDouble();

        double bmi = ceki / (boy * boy);

        System.out.printf("BMI: %.2f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("Kateqoriya: Ariq");
        } else if (bmi < 25) {
            System.out.println("Kateqoriya: Normal");
        } else if (bmi < 30) {
            System.out.println("Kateqoriya: Artiq cekili");
        } else {
            System.out.println("Kateqoriya: Piylenmə");
        }

        sc.close();
    }
}