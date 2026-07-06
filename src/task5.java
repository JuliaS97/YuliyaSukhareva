import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        // Gun nomresinden gun adini tapmaq
        Scanner sc = new Scanner(System.in);

        System.out.print("Gun nomresi daxil edin (1-7): ");
        int gun = sc.nextInt();

        switch (gun) {
            case 1:
                System.out.println("Bazar ertesi");
                break;
            case 2:
                System.out.println("Cersenbe axsami");
                break;
            case 3:
                System.out.println("Cersenbe");
                break;
            case 4:
                System.out.println("Cumea axsami");
                break;
            case 5:
                System.out.println("Cumea");
                break;
            case 6:
                System.out.println("Senbe");
                // break yoxdur - fall-through!
            case 7:
                System.out.println("Bazar");

                // 6 ve 7 ucun "Hefte sonu!" cap olunur
                System.out.println("Hefte sonu!");
                break;
            default:
                System.out.println("Yanlis gun nomresi");
        }

        sc.close();
    }
}