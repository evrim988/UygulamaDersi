package week05.day03;

import java.time.LocalDate;

/*id,
alıcı,
gonderici,
baslik,
icerik,
gonderilmeTarihi*/
public class KullaniciMail {

    private static int mailCount = 0;

    private int id;
    private String alici;
    private String gonderici;
    private String icerik;
    private LocalDate gonderilmeTarihi;

    //Constructor
    public KullaniciMail() {
        this.mailCount++;
        this.id = mailCount;
        this.gonderilmeTarihi = LocalDate.now();
    }

    //Getter and Setter

    public static int getMailCount() {
        return mailCount;
    }

    public static void setMailCount(int mailCount) {
        KullaniciMail.mailCount = mailCount;
    }

    public int getId() {
        return id;
    }

    public String getAlici() {
        return alici;
    }

    public void setAlici(String alici) {
        this.alici = alici;
    }

    public String getGonderici() {
        return gonderici;
    }

    public void setGonderici(String gonderici) {
        this.gonderici = gonderici;
    }

    public String getIcerik() {
        return icerik;
    }

    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }

    public LocalDate getGonderilmeTarihi() {
        return gonderilmeTarihi;
    }

    @Override
    public String toString() {
        return "week05.day03.KullaniciMail{" +
                "id=" + id +
                ", alici='" + alici + '\'' +
                ", gonderici='" + gonderici + '\'' +
                ", icerik='" + icerik + '\'' +
                ", gonderilmeTarihi=" + gonderilmeTarihi +
                '}';
    }
}
