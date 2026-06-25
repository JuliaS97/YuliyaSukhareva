public class task6 {
    public static void main(String[] args) {

        final double PI = 3.14159;
        final int MAX_DENEME = 3;
        final String BANK_KODU = "ABB01";

        System.out.println("Sabitler");
        System.out.println("PI:         " + PI);
        System.out.println("Max deneme: " + MAX_DENEME);
        System.out.println("Bank kodu:  " + BANK_KODU);
        // PI = 3.14;      //Xeta: java: cannot assign a value to final variable PI
        // MAX_DENEME = 5; //Xeta: java: cannot assign a value to final variable MAX_DENEME
        // BANK_KODU = "XYZ99" Xeta: java: cannot assign a value to final variable BANK_KODU

        /*Meqsed: Bank sisteminde faiz, limit kimi deyerler deyisdirilmemelidir
        - final bunu temin edir
         */
    }
}