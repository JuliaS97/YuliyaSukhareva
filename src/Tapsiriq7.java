public class Tapsiriq7 {
    public static void main(String[] args) {
        double mebleg = 8000.0;
        double illikFaiz = 15.0;
        int muddet = 12;

        double umumiFaiz = mebleg * (illikFaiz / 100);
        double umumiOdenis = mebleg + umumiFaiz;
        double ayliqOdenis = umumiOdenis / muddet;

        System.out.println("Kredit Hesabi");
        System.out.println("Mebleg: " + mebleg + " AZN");
        System.out.println("Illik faiz: " + illikFaiz + "%");
        System.out.println("Muddet: " + muddet + " ay");
        System.out.println(" ");
        System.out.println("Umumi faiz: " + umumiFaiz + " AZN");
        System.out.println("Umumi odenis: " + umumiOdenis + " AZN");
        System.out.println("Ayliq odenis: " + ayliqOdenis + " AZN");
    }
}