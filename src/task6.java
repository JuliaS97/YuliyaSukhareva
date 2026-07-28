import java.util.ArrayList;

public class task6 {
    public static void main(String[] args) {
        ArrayList<Integer> emeliyyatlar = new ArrayList<>();
        emeliyyatlar.add(150);
        emeliyyatlar.add(320);
        emeliyyatlar.add(80);
        emeliyyatlar.add(500);
        emeliyyatlar.add(210);

        int cem = 0;
        for (int meblegh : emeliyyatlar) {
            cem += meblegh;
        }
        System.out.println("Ümumi cəm: " + cem);
        emeliyyatlar.clear();

        System.out.println("Siyahı boşdur: " + emeliyyatlar.isEmpty());
    }
}