public class Tapsiriq14 {
    public static void main(String[] args) {

        int n = 84;

        boolean cutdur=n%2 == 0;
        boolean musbetdir=n > 0;
        boolean uceBolunur=n%3 == 0;
        boolean yeddiyeBolunur=n%7 == 0;
        boolean hemUcHemYeddi=(n%3 == 0) && (n%7 == 0);
        boolean aralikda=n>10 && n<100;

        System.out.println("Ededin Xususiyyetleri");
        System.out.println("n="+n);

        System.out.println("Cutmi?-> " + cutdur);
        System.out.println("Musbetmi? -> " + musbetdir);
        System.out.println("3-e bolunur? -> " + uceBolunur);
        System.out.println("7-ye bolunur? -> " + yeddiyeBolunur);
        System.out.println("Hem 3-e hem 7-ye? -> " + hemUcHemYeddi);
        System.out.println("10-dan boyuk 100-den kicik? -> " + aralikda);
        System.out.println(" ");

        n = 105;
        cutdur=n%2 == 0;
        musbetdir=n > 0;
        uceBolunur=n%3 == 0;
        yeddiyeBolunur=n%7 == 0;
        hemUcHemYeddi=(n%3 == 0)&&(n%7 == 0);
        aralikda=n>10&&n<100;

        System.out.println("n="+n);
        System.out.println("Cutmi? -> " + cutdur);
        System.out.println("Musbetmi? -> " + musbetdir);
        System.out.println("3-e bolunur? -> " + uceBolunur);
        System.out.println("7-ye bolunur? -> " + yeddiyeBolunur);
        System.out.println("Hem 3-e hem 7-ye? -> " + hemUcHemYeddi);
        System.out.println("10-dan boyuk 100-den kicik? -> " + aralikda);
        System.out.println("  ");
    }
}