public class task13 {
    public static void main(String[] args) {

        String metn = " Java proqramlasdirma dili cox gucludur! ";

        // 1. Trim-den evvel ve sonra uzunlug
        int evvelUzunlug = metn.length();
        int sonraUzunlug = metn.trim().length();
        System.out.println("Trim-den evvel uzunlug: " + evvelUzunlug);
        System.out.println("Trim-den sonra uzunlug: " + sonraUzunlug);
        System.out.println("Ferq: " + (evvelUzunlug - sonraUzunlug));

        System.out.println("-----------------------");

        // 2. "Java" sozu varmi?
        System.out.println("'Java' varmi? " + metn.contains("Java"));           // true
        System.out.println("'JAVA' (boyuk) varmi? " + metn.toUpperCase().contains("JAVA")); // true

        System.out.println("-----------------------");

        // 3. "proqramlasdirma" sozunu "programming" ile evez et
        String yeniMetn = metn.replace("proqramlasdirma", "programming");
        System.out.println("Replace netice: " + yeniMetn.trim());

        System.out.println("-----------------------");

        // 4. Ilk 4 herf
        String ilk4 = metn.trim().substring(0, 4);
        System.out.println("Ilk 4 herf: " + ilk4); // Java

        System.out.println("-----------------------");

        // 5. "!" isaresi varmi?
        System.out.println("'!' varmi? " + metn.contains("!")); // true

        System.out.println("-----------------------");

        // 6. Kicik herfle, trim edilmis
        System.out.println("Kicik + trim: " + metn.trim().toLowerCase());

    }
}