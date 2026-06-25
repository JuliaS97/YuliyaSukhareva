public class task8 {
    public static void main(String[] args) {

        int yas = 25;
        double gelir = 1200.0;
        boolean tarix = true;

        System.out.println("Yanlis");
        boolean yasUygunYanlis  = yas > 21 && yas < 65;
        /* Xeta: yas > 21 — 21 yasli musteri daxil deyil
        21 yasli ucun: 21 > 21 = false, kredit almaq olmur
        Olmalidir: yas >= 21 */

        boolean gelirUygun = gelir > 800;
        // xeta yoxdur

        boolean uygunYanlis = yasUygunYanlis || gelirUygun || tarix;
        /* Xeta: || (or) deyil, && (and) olmalidir
        || ile biri true olsa kifayetdir, bu yanlisdir
        && ile hamisi true olmalidir */

        System.out.println("Yas uygun (yanlis):   " + yasUygunYanlis);
        System.out.println("Gelir uygun:          " + gelirUygun);
        System.out.println("Kredit (yanlis):      " + uygunYanlis);

        System.out.println(" ");
        System.out.println("Duzgun variant");
        boolean yasUygun = yas >= 21 && yas <= 65;
        boolean uygun = yasUygun && gelirUygun && tarix;

        System.out.println("Yas uygun (duzgun):   " + yasUygun);   // true
        System.out.println("Gelir uygun:          " + gelirUygun); // true
        System.out.println("Kredit (duzgun):      " + uygun);      // true
    }
}