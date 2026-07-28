import java.util.HashMap;
import java.util.Map;

public class task8 {
    public static void main(String[] args) {
        HashMap<String, Integer> filiallar = new HashMap<>();
        filiallar.put("Nərimanov", 45);
        filiallar.put("Yasamal", 32);
        filiallar.put("Xətai", 58);
        filiallar.put("Sabunçu", 27);

        System.out.println("Cüt sayı: " + filiallar.size());

        for (Map.Entry<String, Integer> cut : filiallar.entrySet()) {
            System.out.println(cut.getKey() + " → " + cut.getValue());
        }

        filiallar.remove("Sabunçu");

        System.out.println("Yeni cüt sayı: " + filiallar.size());
    }
}