import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {

        // Sait yoxsa samit yoxlamasi
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir herf daxil edin: ");
        char herf = sc.next().charAt(0);

        switch (herf) {
            case 'a': case 'A':
            case 'e': case 'E':
            case 'i': case 'I':
            case 'o': case 'O':
            case 'u': case 'U':
                System.out.println(herf + " -> Sait");
                break;
            default:
                System.out.println(herf + " -> Samit");
        }

        sc.close();
    }
}