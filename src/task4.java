import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        // Uygun (kecen) il yoxlamasi
        Scanner sc = new Scanner(System.in);

        System.out.print("Il daxil edin: ");
        int il = sc.nextInt();

        // Qayda: 4-e bolunur VE 100-e bolunmur -> uygun
        // VEYA 400-e bolunur -> uygun
        boolean uygunIl = (il % 4 == 0 && il % 100 != 0) || (il % 400 == 0);

        System.out.println(uygunIl ? "Uygun il" : "Uygun deyil");

        sc.close();
    }
}