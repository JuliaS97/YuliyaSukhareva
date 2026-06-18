public class BonusTapsiriq {
        public static void main(String[] args) {

            String musteriAdi = "Aysel Məmmədova";
            int yas = 28;
            double ayligGelir = 1500.0;
            double kreditMeblegi = 10000.0;
            int muddetAy = 24;
            double illikFaiz = 12.0;
            boolean kreditTarixi = true;

            double umumiFaiz = kreditMeblegi * illikFaiz / 100;
            double ayligOdenis = (kreditMeblegi + umumiFaiz) / muddetAy;
            double gelireNisbet = ayligOdenis / ayligGelir * 100;

            boolean yasSerti = yas >= 21 && yas <= 65;
            boolean gelirSerti = ayligGelir > 800;
            boolean meblegSerti = kreditMeblegi >= 300 && kreditMeblegi <= 50000;
            boolean nisbetSerti = gelireNisbet < 40;

            boolean kreditTesdiq = yasSerti && gelirSerti && meblegSerti && nisbetSerti && kreditTarixi;

            System.out.println("Kredit hesabati");
            System.out.println("Musteri adi: " + musteriAdi);
            System.out.println("Yas: " + yas);
            System.out.println("Ayliq gelir: " + ayligGelir + " AZN");
            System.out.println("Kredit meblegi: " + kreditMeblegi + " AZN");
            System.out.println("Muddet: " + muddetAy + " ay");
            System.out.println("Illik faiz: " + illikFaiz + "%");
            System.out.println("Kredit tarixi yaxsidirmi? " + kreditTarixi);

            System.out.println(" ");
            System.out.println("Umumi faiz: " + umumiFaiz + " AZN");
            System.out.println("Ayliq odenis: " + ayligOdenis + " AZN");
            System.out.println("Gelire nisbet: " + gelireNisbet + "%");
            System.out.println(" ");
            System.out.println("Yas serti odenir? " + yasSerti);
            System.out.println("Gelir serti ödənir? " + gelirSerti);
            System.out.println("Mebleg serti odenir? " + meblegSerti);
            System.out.println("Gelire nisbet 40%dan azdir? " + nisbetSerti);

            System.out.println(" ");
            System.out.println("Kredit tesdiqlenir? " + kreditTesdiq);
        }
}
