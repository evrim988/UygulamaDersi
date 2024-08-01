package week05.day03;

public class KullaniciMailSistemi {
    public static void main(String[] args) {

        KullaniciMail mail = new KullaniciMail();
        Kullanici kullanici = new Kullanici();
        Kullanici kullanici1 = new Kullanici();
        mail.setAlici("evrim98@outlook.com");
        mail.setGonderici("Evrim Çalışkan");
        mail.setIcerik("Merhaba, iyi çalışmalar");
        System.out.println(mail);
    }
}
