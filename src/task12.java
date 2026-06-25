public class task12 {
    public static void main(String[] args) {
        String tamAd = "nigar aliyeva";

        // Boslugun indeksini tap
        int bosluqIndeksi = tamAd.indexOf(" ");

        // Ad ve soyadi ayir
        String ad    = tamAd.substring(0, bosluqIndeksi);
        String soyad = tamAd.substring(bosluqIndeksi + 1);

        // 1. Formatlanmis tam ad: Nigar Aliyeva
        String formatliAd = ad.substring(0, 1).toUpperCase() + ad.substring(1)
                + " "
                + soyad.substring(0, 1).toUpperCase() + soyad.substring(1);

        // 2. Yalniz ad: Nigar
        String yalnizAd = ad.substring(0, 1).toUpperCase() + ad.substring(1);

        // 3. Yalniz soyad: Aliyeva
        String yalnizSoyad = soyad.substring(0, 1).toUpperCase() + soyad.substring(1);

        // 4. Bas herfler: N.A.
        String basHerfler = ad.substring(0, 1).toUpperCase()
                + "."
                + soyad.substring(0, 1).toUpperCase()
                + ".";

        // 5. Boyuk herffe: NIGAR ALIYEVA
        String boyukHerffe = tamAd.toUpperCase();

        // Cap
        System.out.println("==== Ad Formatla ====");
        System.out.println("Tam ad (formatlanmis): " + formatliAd);
        System.out.println("Yalniz ad:             " + yalnizAd);
        System.out.println("Yalniz soyad:          " + yalnizSoyad);
        System.out.println("Bas herfler:           " + basHerfler);
        System.out.println("Boyuk herffe:          " + boyukHerffe);
        System.out.println("=====================");
    }
}