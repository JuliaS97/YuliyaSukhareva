public class task12 {
    public static void main(String[] args) {

        int[][] cedvel = {
                {3, 6, 9},
                {12, 15, 18}
        };

        // Cədvəli çap et
        for (int i = 0; i < cedvel.length; i++) {
            for (int j = 0; j < cedvel[i].length; j++) {
                System.out.print(cedvel[i][j] + " ");
            }
            System.out.println();
        }

        // Sətir və sütun sayını çap et
        System.out.println("Sətir sayı: " + cedvel.length);
        System.out.println("Sütun sayı: " + cedvel[0].length);
    }
}