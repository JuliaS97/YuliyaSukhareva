public class task9 {
    public static void main(String[] args) {

        int[] ededler = new int[8];

        for (int i = 0; i < ededler.length; i++) {
            ededler[i] = (i + 1) * 10;
        }

        for (int eded : ededler) {
            System.out.print(eded + " ");
        }
    }
}