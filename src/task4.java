public class task4 {
    public static void main(String[] args) {
        try {
            nagdCixar(1500.0);
        } catch (LimitKecildiException e) {
            System.out.println("Xəta: " + e.getMessage());
        }

        try {
            nagdCixar(2500.0);
        } catch (LimitKecildiException e) {
            System.out.println("Xəta: " + e.getMessage());
        }
    }

    public static void nagdCixar(double meblegh) throws LimitKecildiException {
        double gunlukLimit = 2000.0;
        if (meblegh > gunlukLimit) {
            throw new LimitKecildiException("Gündəlik limit aşıldı: " + meblegh + " AZN (limit: " + gunlukLimit + " AZN)");
        }
        System.out.println("Nağd çıxarıldı: " + meblegh + " AZN");
    }
}

class LimitKecildiException extends Exception {
    public LimitKecildiException(String message) {
        super(message);
    }
}