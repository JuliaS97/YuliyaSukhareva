public class Telefon {

    private int battery;

    public void setBattery(int battery) {
        if (battery >= 0 && battery <= 100) {
            this.battery = battery;
        } else {
            System.out.println("Xəta: Batareya faizi 0-100 aralığında olmalıdır!");
        }
    }

    public int getBattery() {
        return battery;
    }
}