public class Tapsiriq16 {
    public static void main(String[] args) {

        String metn = " Salam, ABB Bank! ";

        System.out.println("Metn: [" + metn + "]");
        System.out.println(" ");

        System.out.println("Uzunlug (trim-siz):    " + metn.length());

        System.out.println("Uzunlug (trim-li): " + metn.trim().length());

        System.out.println("Boyuk herfle: " + metn.toUpperCase());

        System.out.println("Kicik herfle: " + metn.toLowerCase());

        System.out.println("'ABB' var mi? " + metn.contains("ABB"));

        System.out.println("'bank' var mi? " + metn.contains("bank"));

        System.out.println("Replace Bank->Kredit: " + metn.replace("Bank", "Kredit"));

        System.out.println("'Salam' ile baslayir? " + metn.trim().startsWith("Salam"));

    }
}