import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("a daxil edin: ");
        int a = sc.nextInt();

        System.out.print("b daxil edin: ");
        int b = sc.nextInt();

        System.out.println("Evvel: a=" + a + ", b=" + b);

        a = a + b; // a=a+b saxlayir
        b = a - b; // b=evvelki a olur
        a = a - b; // a=evvelki b olur

        System.out.println("Sonra:  a=" + a + ", b=" + b);

        sc.close();
    }
}