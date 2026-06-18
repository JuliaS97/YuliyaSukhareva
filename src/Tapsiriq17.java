public class Tapsiriq17 {
    public static void main(String[] args) {

        String s1 = "test";
        String s2 = "test";
        String s3 = "TEST";
        String s4 = new String("test");
        System.out.println("Muqayise");

        System.out.println(s1.equals(s2)); //true  (mezmun eynidir: "test" == "test")
        System.out.println(s1.equals(s3)); //false ("test" != "TEST", boyuk/kicik ferqlidir)
        System.out.println(s1.equalsIgnoreCase(s3)); //true  (boyuk/kicik nezere alinmir)
        System.out.println(s1.equals("  test  ".trim())); //true (trim bosluqlari aldi, "test" qaldi)



        System.out.println(s1 == s2);
        System.out.println(s1 == s4);

    }
}