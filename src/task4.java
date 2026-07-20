public class task4 {
    public static void main(String[] args) {

        EmanetHesabi hesab = new EmanetHesabi("Aysel", 1000);

        hesab.medaxilEt(500);
        hesab.faizElaveEt(10);

        System.out.println("Hesab sahibi: " + hesab.sahib);
        System.out.println("Son balans: " + hesab.balans);
    }
}