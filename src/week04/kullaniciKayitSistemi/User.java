package week04.kullaniciKayitSistemi;

import java.time.LocalDate;

/*
1- Kullanıcı kayıt sistemi;
Kullanıcı Sınıfı;
id:
adı;
soyadı;
mail;
telNo;
şifre;
kullanıcıAdı;
tcKimlik;
kayıtTarihi;
doğumTarihi;
18 yasindan kucukler kayıt olamasın.*/

public class User {

    //Sınıf Değişkeni
    private static int userId;

    //Nesne Değişkenleri
    private int id;
    private String ad;
    private String soyad;
    private String eMail;
    private String telNo;
    private String sifre;
    private String kullaniciAdi;
    private String tcNo;
    private LocalDate kayitTarihi;
    private LocalDate dogumTarihi;

    //constructor
    public User() {
        this.id = userId++;
        this.kayitTarihi = LocalDate.now();
    }

    //getter and setter

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
        return eMail;
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

    public String getTcNo() {
        return tcNo;
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

    public void setMail(String eMail) {
        this.eMail = eMail;
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

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public void setDogumTarihi(LocalDate dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return "week04.kullaniciKayitSistemi.User{" +
                "id=" + getId() +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", eMail='" + eMail + '\'' +
                ", telNo='" + telNo + '\'' +
                ", sifre='" + sifre + '\'' +
                ", kullaniciAdi='" + kullaniciAdi + '\'' +
                ", tcNo='" + tcNo + '\'' +
                ", kayitTarihi=" + kayitTarihi +
                ", dogumTarihi=" + dogumTarihi +
                '}';
    }
}
