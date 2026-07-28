import java.util.HashMap;
import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        HashMap<String, String> mushteriler = new HashMap<>();
        mushteriler.put("C001", "Aysel Məmmədova");
        mushteriler.put("C002", "Elvin Quliyev");
        mushteriler.put("C003", "Nərmin Əliyeva");
        mushteriler.put("C004", "Rəşad Hüseynov");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Müştəri kodunu daxil edin: ");
        String kod = scanner.nextLine();

        if (mushteriler.containsKey(kod)) {
            System.out.println("Müştəri adı: " + mushteriler.get(kod));
        } else {
            System.out.println("Belə müştəri tapılmadı");
        }
    }
}