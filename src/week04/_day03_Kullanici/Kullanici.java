package week04._day03_Kullanici;

import java.time.LocalDate;

/*Kullanıcı Kayıt Sistemi
* kullanıcı
* kullanıcıCount (statik)
* id
* ad
* soyad
* mail
* telNo
* sifre
* KullanıcıAdı
* tcKimlik
* kayıtTarihi
* dogumTarihi
*/
public class Kullanici {
    //Sınıf Değişkeni
    private static int KullaniciCount = 0;

    //Nesne Değişkeni
    private int id;
    private String ad;
    private String soyad;
    private String mail;
    private String telNo;
    private String sifre;
    private String kullaniciAdi;
    private String tcKimlik;
    private LocalDate kayitTarihi;
    private LocalDate dogumTarihi;

    //constructor
    public Kullanici() {
        this.id = KullaniciCount++;
        //id değerini her seferinde 1 arttırmış olduk.
        this.kayitTarihi = LocalDate.now(); //bugünün tarihini eklemiş olduk.
    }

    //getter ve setter
    public static int getKullaniciCount() {
        return KullaniciCount;
    }

    public int getId() {
        return id;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getMail() {
        return mail;
    }

    public String getTelNo() {
        return telNo;
    }

    public String getSifre() {
        return sifre;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public String getTcKimlik() {
        return tcKimlik;
    }

    public LocalDate getKayitTarihi() {
        return kayitTarihi;
    }

    public LocalDate getDogumTarihi() {
        return dogumTarihi;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public void setTcKimlik(String tcKimlik) {
        this.tcKimlik = tcKimlik;
    }

    public void setDogumTarihi(LocalDate dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return "week04._day03_Kullanici.Kullanici{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", mail='" + mail + '\'' +
                ", telNo='" + telNo + '\'' +
                ", sifre='" + sifre + '\'' +
                ", kullaniciAdi='" + kullaniciAdi + '\'' +
                ", tcKimlik='" + tcKimlik + '\'' +
                ", kayitTarihi=" + kayitTarihi +
                ", dogumTarihi=" + dogumTarihi +
                '}';
    }
}
