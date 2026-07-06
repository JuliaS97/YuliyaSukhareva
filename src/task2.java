import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        // Uc ededden en boyuyunu ve en kiciyini tap
        Scanner sc = new Scanner(System.in);

        System.out.print("a daxil edin: ");
        int a = sc.nextInt();

        System.out.print("b daxil edin: ");
        int b = sc.nextInt();

        System.out.print("c daxil edin: ");
        int c = sc.nextInt();

        // En boyuk
        int enBoyuk;
        if (a >= b && a >= c) {
            enBoyuk = a;
        } else if (b >= a && b >= c) {
            enBoyuk = b;
        } else {
            enBoyuk = c;
        }

        // En kicik
        int enKicik;
        if (a <= b && a <= c) {
            enKicik = a;
        } else if (b <= a && b <= c) {
            enKicik = b;
        } else {
            enKicik = c;
        }

        System.out.println("En boyuk: " + enBoyuk);
        System.out.println("En kicik: " + enKicik);

        sc.close();
    }
}