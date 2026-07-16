import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.print("Ədəd daxil edin: ");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("Cəm: " + sum);
    }
}