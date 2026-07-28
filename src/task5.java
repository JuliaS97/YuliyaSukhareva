import java.util.ArrayList;

public class task5 {
    public static void main(String[] args) {
        ArrayList<String> novbe = new ArrayList<>();
        novbe.add("Elvin");
        novbe.add("Nərmin");
        novbe.add("Rəşad");
        novbe.add("Günel");

        novbe.add(0, "Turan (VIP)");

        String axtarilanAd = "Rəşad";
        if (novbe.contains(axtarilanAd)) {
            System.out.println(axtarilanAd + " növbədədir.");
        } else {
            System.out.println(axtarilanAd + " növbədə deyil.");
        }

        novbe.set(2, "Kamran");

        for (int i = 0; i < novbe.size(); i++) {
            System.out.println(i + ": " + novbe.get(i));
        }
    }
}