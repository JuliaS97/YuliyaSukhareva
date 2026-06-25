public class task4 {
    public static void main(String[] args) {

        int a = 15, b = 40;

        System.out.println("Evvel: a=" + a + ", b=" + b); // a=15, b=40
        int temp = a;   // temp=15, a=15, b=40
        a = b;          // temp=15, a=40, b=40
        b = temp;       // temp=15, a=40, b=15

        System.out.println("Sonra: a=" + a + ", b=" + b); // a=40, b=15
    }
}