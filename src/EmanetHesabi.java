public class EmanetHesabi extends Hesab {

    public EmanetHesabi(String sahib, double balans) {
        super(sahib, balans);
    }

    public void faizElaveEt(double faiz) {
        balans += balans * faiz / 100;
    }
}