public class task3 {
    public static void main(String[] args) {
        try {
            kocurmeEt(500.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Xəta: " + e.getMessage());
        }

        try {
            kocurmeEt(-200.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Xəta: " + e.getMessage());
        }
    }

    public static void kocurmeEt(double meblegh) {
        if (meblegh <= 0) {
            throw new IllegalArgumentException("Məbləğ sıfır və ya mənfi ola bilməz: " + meblegh);
        }
        System.out.println("Köçürüldü: " + meblegh);
    }
}