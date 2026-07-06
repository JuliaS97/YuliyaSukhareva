import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {

        // Parol  yoxlamasi
        Scanner sc = new Scanner(System.in);

        System.out.print("Parolu daxil edin: ");
        String parol = sc.nextLine().trim();

        int uzunlug = parol.length();

        if (uzunlug == 0) {
            System.out.println("Parol bos ola bilmez!");
        } else if (uzunlug < 6) {
            System.out.println("Zəif (uzunlug: " + uzunlug + ")");
        } else if (uzunlug <= 9) {
            System.out.println("Orta (uzunlug: " + uzunlug + ")");
        } else {
            System.out.println("Guclu (uzunlug: " + uzunlug + ")");
        }

        sc.close();
    }
}