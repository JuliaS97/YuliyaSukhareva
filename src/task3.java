import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        // Musbet eded yoxlamasi - do-while ile
        Scanner sc = new Scanner(System.in);

        int eded;

        do {
            System.out.print("Eded daxil edin: ");
            eded = sc.nextInt();

            if (eded <= 0) {
                System.out.println("Yeniden daxil edin!");
            }
        } while (eded <= 0);

        System.out.println("Qebul edildi: " + eded);

        sc.close();
    }
}