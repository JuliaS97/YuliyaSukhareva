public class Tapsiriq13 {
    public static void main(String[] args) {

        int yas1 = 34;
        double gelir1 = 1500;
        double mebleq1 = 10000;
        boolean tarix1 = true;
        boolean uygun1 = (yas1 >= 21 && yas1 <= 65)
                && (gelir1 > 800)
                && (mebleq1 >= 300 && mebleq1 <= 50000)
                && tarix1;

        int yas2 = 19;
        double gelir2 = 950;
        double mebleg2 = 3000;
        boolean tarix2 = true;
        boolean uygun2 = (yas2 >= 21 && yas2 <= 65)
                && (gelir2 > 800)
                && (mebleg2 >= 300 && mebleg2 <= 50000)
                && tarix2;


        int yas3 = 45;
        double gelir3 = 750;
        double mebleg3 = 7000;
        boolean tarix3 = false;
        boolean uygun3 = (yas3 >= 21 && yas3 <= 65)
                && (gelir3 > 800)
                && (mebleg3 >= 300 && mebleg3 <= 50000)
                && tarix3;


        System.out.println("Kredit Uygunlugu");

        System.out.println("Musteri 1");
        System.out.println("Yas: " + yas1 + ", Gelir: " + gelir1
                + ", Meblеq: " + mebleq1 + ", Tarix: " + tarix1);
        System.out.println("Kredit uygun: " + uygun1);
        System.out.println(" ");
        System.out.println("Musteri 2");
        System.out.println("Yas: " + yas2 + ", Gelir: " + gelir2
                + ", Mebleg: " + mebleg2 + ", Tarix: " + tarix2);
        System.out.println("Kredit uygun: " + uygun2);
        System.out.println(" ");
        System.out.println("Musteri 3");
        System.out.println("Yas: " + yas3 + ", Gelir: " + gelir3
                + ", Mebleg: " + mebleg3 + ", Tarix: " + tarix3);
        System.out.println("Kredit uygun: " + uygun3);

    }
}