import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        // Imtahan balina gore qiymet vermek
        Scanner sc = new Scanner(System.in);

        System.out.print("Imtahan balini daxil edin (0-100): ");
        int bal = sc.nextInt();

        if (bal > 100 || bal < 0) {
            System.out.println("Yanlis bal!");
        } else if (bal >= 90) {
            System.out.println("Ela (5)");
        } else if (bal >= 80) {
            System.out.println("Cox yaxsi (4)");
        } else if (bal >= 70) {
            System.out.println("Yaxsi (3)");
        } else if (bal >= 60) {
            System.out.println("Kafi (2)");
        } else {
            System.out.println("Qeyri-kafi (1)");
        }

        sc.close();
    }
}