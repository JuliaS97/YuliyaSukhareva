public class task5 {
    public static void main(String[] args) {
        int bal1 = 78, bal2 = 91, bal3 = 84;

        // yanlis yol - int/int = int, onluq hisse itir
        // (78 + 91 + 84) / 3 = 253 / 3 = 84 (84.33 deyil)
        int yanlis = (bal1 + bal2 + bal3) / 3;
        System.out.println("Yanlis orta: " + yanlis); // 84 (yanlis)

        // duzgun yol 1 - 3.0 ile bolmek
        double orta1 = (bal1 + bal2 + bal3) / 3.0;
        System.out.println("Duzgun orta (3.0): " + orta1); // 84.33...

        // duzgun yol 2 - (double) cast
        double orta2 = (double)(bal1 + bal2 + bal3) / 3;
        System.out.println("Duzgun orta (cast): " + orta2); // 84.33...
    }
}