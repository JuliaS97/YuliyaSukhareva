import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int gizli = 42;
        int cehd = 0;

        System.out.println("1-100 arasinda bir eded dusundum.");
        System.out.println("Tapmaga calis!");
        System.out.println("---------------------------");

        while (true) {
            System.out.print("Ededinizi daxil edin: ");
            int taxmin = sc.nextInt();
            cehd++;

            if (taxmin < gizli) {
                System.out.println("Boyukdur! Daha boyuk eded daxil edin.");
            } else if (taxmin > gizli) {
                System.out.println("Kicikdir! Daha kicik eded daxil edin.");
            } else {
                System.out.println("Tapdin! Tebrikler!");
                break;
            }
        }



        System.out.println("Umumi cehd sayi: " + cehd);


        sc.close();
    }
}