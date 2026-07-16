public class task7 {
    public static void main(String[] args) {

        int[] ededler = {7, 12, 5, 20, 33, 46, 9};
        int say = 0;

        for (int eded : ededler) {
            if (eded % 2 == 0) {
                say++;
            }
        }

        System.out.println("Cüt ədədlərin sayı: " + say);
    }
}