public class task7 {
    public static void main(String[] args) {

        // 1. Temperatur 36-dan cox, 37.5-den azdir
        double temp = 36.8;
        boolean normalTemp = temp > 36 && temp < 37.5;

        // 2. Sureт 0-dan cox, 120-den az VE YA yanacaq 0-dan coxdur
        int surет = 95, yanacaq = 0;
        boolean getmeyeDavam = (surет > 0 && surет < 120) || yanacaq > 0;

        // 3. Hesab aktiv deyil VE ya balans menfidir
        boolean aktiv = false;
        double balans = -50.0;
        boolean problemliHesab = !aktiv || balans < 0;

        // 4. Ad bos deyil VE yas 18-den boyukdur
        String ad = "Anar";
        int yas = 22;
        boolean qeydiyyataUygun = ad.length() > 0 && yas > 18;

        System.out.println("Temp: " + temp);
        System.out.println("Normal temp (36-37.5): " + normalTemp);       // true

        System.out.println("Suret: " + surет + ", Yanacaq: " + yanacaq);
        System.out.println("Getmeye davam: " + getmeyeDavam);     // true (suret 0-120 arasinda)

        System.out.println("Aktiv: " + aktiv + ", Balans: " + balans);
        System.out.println("Problemli hesab: " + problemliHesab);   // true (aktiv=false, balans<0)

        System.out.println("Ad: " + ad + ", Yas: " + yas);
        System.out.println("Qeydiyyata uygun: " + qeydiyyataUygun); // true

    }
}