public class task1 {
    public static void main(String[] args) {

        Telefon telefon = new Telefon();

        telefon.setBattery(80);
        telefon.setBattery(120);
        telefon.setBattery(-5);
        telefon.setBattery(45);

        System.out.println("Son batareya faizi: " + telefon.getBattery() + "%");
    }
}