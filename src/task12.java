import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Yasi daxil edin: ");
        int yas = sc.nextInt();

        if (yas < 0) {
            System.out.println("Yanlis yas!");
        } else if (yas <= 5) {
            System.out.println("Pulsuz");
        } else if (yas <= 17) {
            System.out.println("5 AZN");
        } else if (yas <= 64) {
            System.out.println("10 AZN");
        } else {
            System.out.println("3 AZN");
        }

        sc.close();
    }
}