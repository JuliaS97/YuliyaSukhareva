import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("a daxil edin: "); //17
        int a = sc.nextInt();

        System.out.print("b daxil edin: "); //5
        int b = sc.nextInt();

        System.out.println("Toplama:        " + (a + b));
        System.out.println("Cixma:          " + (a - b));
        System.out.println("Vurma:          " + (a * b));
        System.out.println("Bolme (int):    " + (a / b));
        // int/int = int — onluq hisse itir 17/5 = 3, 3.4 deyil
        System.out.println("Bolme (double): " + (double) a / b);
        System.out.println("Qalig:          " + (a % b));

        sc.close();
    }
}