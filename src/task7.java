import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("double daxil edin: "); //1,7
        double sayi = sc.nextDouble();

        // (int) casting
        int casting = (int) sayi;

        // Math.round() - yuvarlayir
        long rounded = Math.round(sayi);

        System.out.println("Eded: " + sayi);
        System.out.println("(int) cast: " + casting); //1
        System.out.println("Math.round():  " + rounded); //2


  /* Ferq: (int) sadece kesir;
     Meselen: -4.7 -> (int) = -4, Math.round() = -5"
    "Math.round() riyazi yuvarlama aparir  */

        sc.close();
    }
}