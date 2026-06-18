public class Tapsiriq9 {
    public static void main(String[] args) {

        int sayi = 583;
        int yuzler = sayi / 100;
        int onlar = (sayi % 100) / 10;
        int birler = sayi % 10;
        int cem = yuzler + onlar + birler;

        System.out.println("Ededi Parcala");
        System.out.println("Eded: " + sayi);
        System.out.println("Yuzler: " + yuzler);
        System.out.println("Onlar: " + onlar);
        System.out.println("Birler: " + birler);
        System.out.println("Cem: " + cem);
        System.out.println(" ");

        int sayi2 = 907;
        int yuzler2 = sayi2 / 100;
        int onlar2 = (sayi2 % 100) / 10;
        int birler2 = sayi2 % 10;
        int cem2 = yuzler2 + onlar2 + birler2;
        System.out.println("Ededi Parcala");
        System.out.println("Eded: " + sayi2);
        System.out.println("Yuzler: " + yuzler2);
        System.out.println("Onlar: " + onlar2);
        System.out.println("Birler: " + birler2);
        System.out.println("Cem: " + cem2);
    }
}