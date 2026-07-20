public class task5 {
    public static void main(String[] args) {

        Kalkulyator kalkulyator = new Kalkulyator();

        System.out.println("İki tam ədəd: " + kalkulyator.vurma(5, 4));
        System.out.println("Üç tam ədəd: " + kalkulyator.vurma(2, 3, 4));
        System.out.println("İki kəsr ədəd: " + kalkulyator.vurma(2.5, 4.0));
    }
}