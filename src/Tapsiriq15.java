public class Tapsiriq15 {
    public static void main(String[] args) {
        int a = 10, b = 3;
        boolean x = true, y = false;
        String s = "Java";
        System.out.println("Netice");

        System.out.println(a + b * 2);      // 16  (evvel * sonra +: 10 + 6 = 16)
        System.out.println(a / b);           // 3   (int bolme: 10/3 = 3, qaliq itir)
        System.out.println(a % b);           // 1   (10 = 3x3 + 1, qaliq = 1)
        System.out.println(x && !y);         // true  (true && !false = true && true)
        System.out.println(!x || y);         // false (!true || false = false || false)
        System.out.println(a > 5 && b < 5); // true  (10>5=true, 3<5=true, true&&true)

        System.out.println(s + a);           // Java10  (String + int = String)
        System.out.println("3" + 4);         // 34      (String + int = String, birleshme!)
        System.out.println(3 + 4 + "!");     // 7!      (int+int=7, sonra 7+"!"="7!")
        System.out.println("!" + 3 + 4);     // !34     (String+"3"="!3", sonra "!3"+"4"="!34")

    }
}