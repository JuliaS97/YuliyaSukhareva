public class task10 {
    public static void main(String[] args) {

        int mebleg = 5000;
        int faiz   = 15;

        double faizMeblegiYanlis = mebleg * faiz / 100;
        System.out.println("Yanlis: " + faizMeblegiYanlis); // 750.0 (tesadufen duzgun)
        /* YANLIS - int * int / int = int, sonra double-a cevirilir
        5000 * 15 = 75000, 75000 / 100 = 750 (int), sonra 750.0
        Bu halda tesadufen duzgun cixir */

        // baska eded ile sinayaq
        int mebleg2 = 2345;
        int faiz2   = 3;
        double yanlis2 = mebleg2 * faiz2 / 100;
        System.out.println("Yanlis: " + yanlis2); // 2345 * 3 / 100 = 7035/100 = 70 (70.35 olmalidir)

        System.out.println("--------------");
        System.out.println("Duzgun variant");

        // variant 1 - 100.0 ile bolmek
        double faizMeblegi1 = mebleg * faiz / 100.0;
        System.out.println("Duzgun (100.0):  " + faizMeblegi1); // 750.0

        double faizMeblegi2 = mebleg2 * faiz2 / 100.0;
        System.out.println("Duzgun (100.0):  " + faizMeblegi2); // 70.35

        // variant 2 - (double) cast
        double faizMeblegi3 = (double)(mebleg * faiz) / 100;
        System.out.println("Duzgun (cast):   " + faizMeblegi3); // 750.0

        double faizMeblegi4 = mebleg2 * faiz2 / 100.0;
        System.out.println("Duzgun (100.0):  " + faizMeblegi4); // 70.35

        /* izah:
        int * int / int  → butun hesablama int olaraq gedir
        int * int / 100.0 → son bolme double olur, netice double
         */
    }
}