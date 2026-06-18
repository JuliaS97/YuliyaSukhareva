public class Tapsiriq4 {
    public static void main(String[] args) {

        int yas = 25;                    // Xəta 1: "Int"-"int" (kiçik hərflə yazılır)
        String sehir = "baku";           // Xəta 2: baku-"baku" (String dəyəri dırnaq içinə alınmalıdır)
        double kreditMeblegi = 5000;     // Xəta 3: "kredit meblegi"-"kreditMeblegi" (boşluq olmaz)
        boolean aktiv = true;            // Xəta 4: "True"-"true" (boolean kiçik hərflə true/false)
        final int LIMIT = 100;
        // LIMIT = 200;                  // Xəta 5: final dəyəri dəyişdirilə bilməz

        System.out.println(yas);         // Xəta 6: println(yas).-println(yas); (nöqtə yox, ; olmalıdır)
    }
}
