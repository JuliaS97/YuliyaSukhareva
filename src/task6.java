public class task6 {
    public static void main(String[] args) {

        Bildiris[] bildirisler = {
                new EmailBildiris(),
                new SmsBildiris(),
                new PushBildiris()
        };

        for (Bildiris bildiris : bildirisler) {
            bildiris.gonder();
        }
    }
}

class Bildiris {
    public void gonder() {
        System.out.println("Bildiriş göndərildi.");
    }
}

class EmailBildiris extends Bildiris {
    @Override
    public void gonder() {
        System.out.println("E-mail bildirişi göndərildi.");
    }
}

class SmsBildiris extends Bildiris {
    @Override
    public void gonder() {
        System.out.println("SMS bildirişi göndərildi.");
    }
}

class PushBildiris extends Bildiris {
    @Override
    public void gonder() {
        System.out.println("Push bildirişi göndərildi.");
    }
}