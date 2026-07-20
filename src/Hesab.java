public class Hesab {

    protected String sahib;
    protected double balans;

    public Hesab(String sahib, double balans) {
        this.sahib = sahib;
        this.balans = balans;
    }

    public void medaxilEt(double mebleg) {
        balans += mebleg;
    }
}