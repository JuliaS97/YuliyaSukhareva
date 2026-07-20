public class task7 {
    public static void main(String[] args) {

        KofeMasini kofeMasini = new KofeMasini();
        kofeMasini.kofeHazirla();
    }
}

class KofeMasini {

    public void kofeHazirla() {
        suQizdir();
        kofeTok();
        fincaniDoldur();
        System.out.println("Kofe hazırdır.");
    }

    private void suQizdir() {
        System.out.println("Su qızdırılır...");
    }

    private void kofeTok() {
        System.out.println("Kofe tökülür...");
    }

    private void fincaniDoldur() {
        System.out.println("Fincan doldurulur...");
    }
}