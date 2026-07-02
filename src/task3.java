import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("3 reqemli tam eded daxil edin: ");
        int reqem = sc.nextInt();

        int yuzler = reqem / 100;
        int onlar = (reqem % 100) / 10;
        int birler = reqem % 10;
        int cem = yuzler + onlar + birler;

        System.out.println("Eded: " + reqem);
        System.out.println("Yuzler: " + yuzler);
        System.out.println("Onlar: " + onlar);
        System.out.println("Birler: " + birler);
        System.out.println("Cem: " + cem);

        sc.close();
    }
}