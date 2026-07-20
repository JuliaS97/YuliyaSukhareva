public class Telebe {

    private String ad;
    private int bal;

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAd() {
        return ad;
    }

    public void setBal(int bal) {
        if (bal >= 0 && bal <= 100) {
            this.bal = bal;
        } else {
            System.out.println("Xəta: Bal 0-100 aralığında olmalıdır!");
        }
    }

    public int getBal() {
        return bal;
    }

    public String getQiymet() {
        if (bal >= 90) {
            return "Əla";
        } else if (bal >= 70) {
            return "Yaxşı";
        } else if (bal >= 50) {
            return "Kafi";
        } else {
            return "Qeyri-kafi";
        }
    }
}