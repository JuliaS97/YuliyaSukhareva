import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Bali daxil edin (1-100): ");
        int bal = sc.nextInt();

        String qiymet;

        if (bal >= 90) {
            qiymet = "Ela";
        } else if (bal >= 70) {
            qiymet = "Yaxsi";
        } else if (bal >= 50) {
            qiymet = "Kafi";
        } else {
            qiymet = "Qeyri-kafi";
        }

        System.out.println("Bal: " + bal + " -> Qiymet: " + qiymet);

        sc.close();
    }
}