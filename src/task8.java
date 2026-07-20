public class task8 {
    public static void main(String[] args) {

        Bankomat bankomat = new Bankomat();

        bankomat.pulCek(1500);
        bankomat.pulCek(300);
    }
}

class Bankomat {

    private double balans = 1000;

    public void pulCek(double mebleg) {
        if (yoxla(mebleg)) {
            balans -= mebleg;
            System.out.println("Çəkilən məbləğ: " + mebleg);
            System.out.println("Qalıq balans: " + balans);
        } else {
            System.out.println("Balans kifayət etmir.");
        }
    }

    private boolean yoxla(double mebleg) {
        return mebleg <= balans;
    }
}