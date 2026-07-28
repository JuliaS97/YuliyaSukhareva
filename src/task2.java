public class task2 {
    public static void main(String[] args) {
        String kartSahibi = null;
        yoxla(kartSahibi);

        kartSahibi = "Aysel Məmmədova";
        yoxla(kartSahibi);
    }

    public static void yoxla(String kartSahibi) {
        try {
            int uzunluq = kartSahibi.length();
            System.out.println("Kart sahibinin adının simvol sayı: " + uzunluq);
        } catch (NullPointerException e) {
            System.out.println("Kart məlumatı tapılmadı");
        } finally {
            System.out.println("Sessiya bağlandı");
        }
    }
}