public class Tapsiriq18 {
    public static void main(String[] args) {

        String tamAd = "leyla huseynova";

        System.out.println("Original: " + tamAd);
        System.out.println(" ");

        int bosluq = tamAd.indexOf(" ");
        String ad = tamAd.substring(0, bosluq);
        String soyad = tamAd.substring(bosluq + 1);
        String netice = ad.substring(0, 1).toUpperCase() + ad.substring(1)
                + " "
                + soyad.substring(0, 1).toUpperCase() + soyad.substring(1);
        System.out.println("Bas herfer boyuk: " + netice);

        System.out.println("Uzunlug: " + tamAd.length());

        System.out.println("Ilk 5 herf: " + tamAd.substring(0, 5));

        System.out.println("Bosluq varmi?  " + tamAd.contains(" "));

        System.out.println("'leyla' baslayir? " + tamAd.startsWith("leyla"));

        System.out.println("Boyuk herffe: " + tamAd.toUpperCase());

        System.out.println(" ");
        System.out.println("sual cavabi:  " + netice);

    }
}