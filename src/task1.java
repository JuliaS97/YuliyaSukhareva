import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int umumiXerc = 1240;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Əməliyyat sayını daxil edin: ");
            int emeliyyatSayi = scanner.nextInt();

            int ortaMebleg = umumiXerc / emeliyyatSayi;
            System.out.println("Orta əməliyyat məbləği: " + ortaMebleg);

        } catch (ArithmeticException e) {
            System.out.println("Xəta: Əməliyyat sayı sıfır ola bilməz!");
        } catch (Exception e) {
            System.out.println("Xəta baş verdi: " + e.getMessage());
        } finally {
            System.out.println("Hesabat tamamlandı");
        }
    }
}