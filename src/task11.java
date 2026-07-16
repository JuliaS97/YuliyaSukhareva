public class task11 {
    public static void main(String[] args) {

        int[] orijinal = {5, 10, 15, 20};
        int[] kopya = new int[orijinal.length];

        // Massivin əsl kopyasını yarat
        for (int i = 0; i < orijinal.length; i++) {
            kopya[i] = orijinal[i];
        }

        // Kopyanı dəyiş
        kopya[0] = 99;

        // Orijinal massivi çap et
        System.out.print("Orijinal: ");
        for (int eded : orijinal) {
            System.out.print(eded + " ");
        }

        System.out.println();

        // Kopya massivi çap et
        System.out.print("Kopya: ");
        for (int eded : kopya) {
            System.out.print(eded + " ");
        }
    }
}