import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Ay nomresi daxil edin (1-12): ");
        int ay = sc.nextInt();

        switch (ay) {
            case 1:
            case 2:
            case 3:
                System.out.println("I rub (Yanvar - Mart)");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("II rub (Aprel - Iyun)");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("III rub (Iyul - Sentyabr)");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("IV rub (Oktyabr - Dekabr)");
                break;
            default:
                System.out.println("Yanlis ay nomresi! (1-12 daxil edin)");
        }

        sc.close();
    }
}