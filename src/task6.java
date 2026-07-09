import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        // Mobil nomre kodu uzre operator tapmaq
        Scanner sc = new Scanner(System.in);

        System.out.print("Nomre kodunu daxil edin (050, 051, 055, 070, 077, 099): ");
        String kod = sc.nextLine().trim();

        switch (kod) {
            case "050":
            case "051":
                System.out.println("Operator: Azercell");
                break;
            case "055":
            case "099":
                System.out.println("Operator: Bakcell");
                break;
            case "070":
            case "077":
                System.out.println("Operator: Nar");
                break;
            default:
                System.out.println("Namelum operator!");
        }

        sc.close();
    }
}