import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Email daxil edin: ");
        String email = sc.nextLine().trim();

        boolean atVar = email.contains("@");

        boolean noqteVar = email.contains(".");
        /* Burda a.b@mail da true kimi qaytarir. AI bu kodu yazdi, amma hele kecmediyimiz ucun
         komment kimi elave edirem
         "." "@"-DAN SONRA olmalidir
        boolean nokteVar   = atIndex != -1 && email.indexOf(".", atIndex) != -1; */

        boolean atEvvel2 = email.indexOf("@") >= 2;
        boolean emailUygun = atVar && noqteVar && atEvvel2;

        System.out.println("Email Yoxlanisi");
        System.out.println("Email: " + email);
        System.out.println("'@' var:" + atVar);
        System.out.println("'.' var:" + noqteVar);
        System.out.println("'@'-den evvel 2+ simvol: " + atEvvel2);
        System.out.println("Email uygun: " + emailUygun);

        sc.close();
    }
}

