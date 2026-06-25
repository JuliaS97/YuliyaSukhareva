public class task3 {
    public static void main(String[] args) {
        int     a = 8,  b = 3;
        boolean p = true, q = false;
        String  s = "QA";

        System.out.println(a + b);          // 11  (8 + 3)
        System.out.println(a - b * 2);      // 2   (evvel *: 3*2=6, sonra 8-6=2)
        System.out.println(a / b);          // 2   (int bolme: 8/3=2, qaliq itir)
        System.out.println(a % b);          // 2   (8 = 3x2 + 2, qaliq=2)
        System.out.println(p && q);         // false (true && false)
        System.out.println(p || q);         // true  (true || false)
        System.out.println(!p && !q);       // false (!true=false, false&&true=false)
        System.out.println(a > 5 || b > 5); // true  (8>5=true, true||false=true)
        System.out.println(s + a + b);      // QA83  (String+"8"="QA8", "QA8"+"3"="QA83")
        System.out.println(a + b + s);      // 11QA  (int+int=11, 11+"QA"="11QA")

    }
}