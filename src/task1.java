import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        // Ededin cut/tek ve isare yoxlanmasi
        Scanner sc = new Scanner(System.in);

        System.out.print("Tam eded daxil edin: ");
        int eded = sc.nextInt();

        // Cut/tek yoxlama
        if (eded % 2 == 0) {
            System.out.println(eded + " cutdur.");
        } else {
            System.out.println(eded + " tekdir.");
        }
        23
        if (eded > 0) {
            System.out.println(eded + " musbetdir.");
        } else if (eded < 0) {
            System.out.println(eded + " menfidir.");
        } else {
            System.out.println("Eded sifirdir.");
        }

        sc.close();
    }
}