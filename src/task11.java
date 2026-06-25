public class task11 {
    public static void main(String[] args) {

        String parol = "Abb@2024";

        // Yoxlamalar
        boolean uzunUygun = parol.length() > 8;
        boolean xarakterVar = parol.contains("@");
        boolean abbIleBaslayir = parol.toUpperCase().startsWith("ABB");
        boolean reqemVar = parol.contains("2024");
        boolean gucluParol = uzunUygun && xarakterVar && abbIleBaslayir && reqemVar;

        System.out.println("Parol Yoxlamasi");
        System.out.println("Parol: " + parol);
        System.out.println("Uzunlug > 8: "  + uzunUygun);       // false (8 herf var, >8 deyil)
        System.out.println("'@' var: " + xarakterVar);     // true
        System.out.println("'ABB' ile baslayir: " + abbIleBaslayir);  // true
        System.out.println("'2024' var mi: " + reqemVar);        // true
        System.out.println("-------------------------");
        System.out.println("Guclu parol?       " + gucluParol);      // false (uzunlug 8, >8 deyil!)



    }
}