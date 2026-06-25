public class task9 {
    public static void main(String[] args) {

        String kod = "  abb-2024  ";
        System.out.println("Yanlis variant");
        System.out.println(kod.length());
        /* Xeta: length() bosluqlari da sayir
        "  abb-2024  " = 2 bosluq + 8 herf + 2 bosluq = 12
        Gozlenilen: 8, Netice: 12 */


        System.out.println(kod.contains("ABB"));
        /* Xeta: contains() case-sensitive-dir
        "  abb-2024  " icinde "ABB" yox, "abb" var
        Gozlenilen: true, Netice: false */
        System.out.println(kod.trim() == "abb-2024");
        /* Xeta: == String mezmununu deyil, adresini muqayise edir
        Gozlenilen: true, Netice: false
        Xeta: == yerine .equals() olmalidir */

        System.out.println(kod.toUpperCase().contains("ABB"));
        // Gozlenilen: true, Esas netice: true
        System.out.println("---------------");
        System.out.println("Duzgun variant");

        // trim() ile bosluqlar silindi, sonra length()
        System.out.println(kod.trim().length());          // 8

        // kicik herfle
        System.out.println(kod.contains("abb"));          // true

        // == yerine .equals()
        System.out.println(kod.trim().equals("abb-2024")); // true

        // Bu duzgun idi
        System.out.println(kod.toUpperCase().contains("ABB")); // true


    }
}