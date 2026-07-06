import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {

        // Ucbucaq novu yoxlamasi
        Scanner sc = new Scanner(System.in);

        System.out.print("a terefini daxil edin: ");
        double a = sc.nextDouble();

        System.out.print("b terefini daxil edin: ");
        double b = sc.nextDouble();

        System.out.print("c terefini daxil edin: ");
        double c = sc.nextDouble();

        // Ucbucaq mumkundurmu?
        if (a + b > c && a + c > b && b + c > a) {
            // Novunu mueyyen et
            if (a == b && b == c) {
                System.out.println("Beraberterefi ucbucaq");
            } else if (a == b || b == c || a == c) {
                System.out.println("Beraberyani ucbucaq");
            } else {
                System.out.println("Muxtelifterefli ucbucaq");
            }
        } else {
            System.out.println("Bele ucbucaq movcud deyil");
        }

        sc.close();
    }
}