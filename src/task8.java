public class task8 {
    public static void main(String[] args) {

        int[] ballar = {67, 91, 54, 88, 73};

        int enBoyuk = ballar[0];

        for (int bal : ballar) {
            if (bal > enBoyuk) {
                enBoyuk = bal;
            }
        }

        System.out.println("Ən böyük bal: " + enBoyuk);
    }
}