import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Eded daxil edin (String kimi): ");
        String stringEdedi = sc.nextLine().trim();

        // String -> int (parseInt)
        int eded = Integer.parseInt(stringEdedi);
        System.out.println("String -> int:  " + stringEdedi + " -> " + eded);

        // Riyazi emeliyyat
        int netice = eded * 2;
        System.out.println("Emeliyyat (x2): " + eded + " * 2 = " + netice);

        // int -> String (valueOf)
        String stringNetice = String.valueOf(netice);
        System.out.println("int -> String:  " + netice + " -> \"" + stringNetice + "\"");

        // String uzunlugu
        System.out.println("Uzunlug: " + stringNetice.length() + " reqem");

        sc.close();
    }
}