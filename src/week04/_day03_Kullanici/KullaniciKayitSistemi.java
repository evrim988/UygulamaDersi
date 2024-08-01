package week04._day03_Kullanici;

import week04._day03_Kullanici.Kullanici;


import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class KullaniciKayitSistemi {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        OzelListe1 liste = new OzelListe1();
        liste.add(5);
        for (var item: liste.getSayiDizisi()){
            System.out.println(item);
        }

        Kullanici kullanici1 = new Kullanici();
        Kullanici kullanici2 = new Kullanici();

        System.out.println("Id: " + kullanici1.getId() + " kullaniciCount : " + Kullanici.getKullaniciCount() + " kayitTarihi : " + kullanici1.getKayitTarihi());
        System.out.println("Id: " + kullanici2.getId() + " kullaniciCount : " + Kullanici.getKullaniciCount() + " kayitTarihi : " + kullanici2.getKayitTarihi());

        //Id: 1 kullaniciCount : 2 kayitTarihi : 2024-07-21
        //Id: 2 kullaniciCount : 2 kayitTarihi : 2024-07-21

        //menu();
    }

    public static void menu() {
        int secim = 0;
        do {
            System.out.println("----------Kullanici Kayit Sistemi-------");
            System.out.println("1 -> Kayıt Ol");
            System.out.println("0 -> Çıkış Yap");
            System.out.print("Seçiminiz: ");
            secim = scanner.nextInt();
            kullaniciSecimi(secim);
        } while (secim != 0);
    }

    public static void kullaniciSecimi(int secim) {
        switch (secim) {
            case 1: {
                Kullanici kullanici = kullaniciKaydi();
                System.out.println(kullanici);
                break;
            }
            default: {
                System.out.println("Hatalı giriş yaptınız. Lütfen 0 veya 1 değeri giriniz...");
            }
        }
    }

    public static Kullanici kullaniciKaydi() {
        Kullanici kullanici;
        LocalDate dogumTarihi;
        dogumTarihi = dogumTarihiAl(); //dogumTarihi doğru girilip girilmediğini kontrol ediyoruz.
        if (dogumTarihiKontrol(dogumTarihi)) { //18 yaşından büyükse if bloğu değilse else bloğu çalışır.
            kullanici = new Kullanici(); //Kullanici constructorı burda çalıştırdık.
            String[] isimSoyisim = isimSoyisimAl();
            kullanici.setAd(isimSoyisim[0]); //ad
            kullanici.setSoyad(isimSoyisim[1]); //soyad
            kullanici.setMail(emailAl()); //email adresini ekledik.
            kullanici.setTelNo(telNoAl()); //telefon numarasını ekledik.
            kullanici.setSifre(sifreAl()); //şifre girişini aldık.
            kullanici.setKullaniciAdi(kullaniciAdiAl()); //kullanıcı adını aldık.
            kullanici.setTcKimlik(tcKimlikAl());
            return kullanici;
        } else {
            System.out.println("18 yasindan kucukler kayit islemi gerceklestiremez...");
        }
        return null;
    }

    private static String tcKimlikAl(){
        String tcKimlik;
        while (true) {
            System.out.print("Lutfen TC Kimlik no giriniz: ");
            tcKimlik = scanner.nextLine();
            if(tcKimlik.length() != 11) {
                System.out.println("TC Kimlik Numarası 11 Haneli olmalıdır.");
                continue;
            } else if (!numerikDegerKontrol(tcKimlik)) { //false deger döner. Numerik değilse else-if içine girer.
                System.out.println("TC Kimlik Numarası Sadece Numerik Deger Barındırır.");
                continue;
            }
            return tcKimlik;
        }
    }

    private static boolean numerikDegerKontrol(String value){
        for (int i = 0; i < value.length(); i++) {
            if(!Character.isDigit(value.charAt(i))) { //numerik değer değilse false döner.
                return false;
            }
        }
        return true;
    }

    private static String kullaniciAdiAl(){
        String kullaniciAdi;
        while (true){
            System.out.print("Lutfen bir kullanici adi giriniz(min 4 - max 16 karakter): ");
            kullaniciAdi = scanner.nextLine();
            if (kullaniciAdi.length() < 4){
                System.out.println("Kullanici adi 4 karakterden kucuk olamaz.");
                continue;
            } else if (kullaniciAdi.length() > 16) {
                System.out.println("Kullanici adi 16 karakterden buyuk olamaz.");
                continue;
            }
            return kullaniciAdi;
        }
    }

    private static String sifreAl(){
        String sifre;
        String sifreYeniden;
        while (true) {
            System.out.print("Lutfen bir sifre giriniz(min 8 - max 32 karakter): ");
            sifre = scanner.nextLine();
            if (sifre.length() < 8){
                System.out.println("Sifre 8 karakterden kisa olamaz.");
                continue;
            } else if (sifre.length() > 32) {
                System.out.println("Sifre 32 karakterden buyuk olamaz.");
                continue;
            }
            else {
                System.out.print("Lutfen sifrenizi yeniden giriniz: ");
                sifreYeniden = scanner.nextLine();
                if(sifre.equals(sifreYeniden)){
                    return sifre; //şifreler birbiri ile eşleşiyorsa şifreyi geri döner.
                }
                else {
                    System.out.println("Girdiginiz sifreler birbiri ile eslesmiyor...");
                }
            }
        }
    }

    private static String telNoAl() {
        System.out.print("Lutfen telefon numaranızı giriniz: +90 ");
        String telNo = scanner.nextLine();
        return telNo;
    }

    //kullanıcıdan email adresini alıp geri döndürdük.
    private static String emailAl(){
        System.out.print("Lutfen email adresinizi giriniz: ");
        String email = scanner.nextLine();
        return email;
    }

    //kullanıcıdan adı ve soyadını bir diziye aktarığ fullname şeklinde aldık.
    private static String[] isimSoyisimAl() {
        String[] isimSoyisim = new String[2];
        System.out.print("Lutfen adinizi ve soyadinizi giriniz: ");
        isimSoyisim[0] = scanner.nextLine();
        System.out.println("Lutfen soyadinizi giriniz: ");
        isimSoyisim[1] = scanner.next();
        return isimSoyisim;
    }

    //yaş 18 den küçükse false dönüyor, eğer büyükse false dönüyor.18 yaş olması için tam doldurmuş olması durumunu da kontrol ediyor.
    private static boolean dogumTarihiKontrol(LocalDate date) {
        int yas = Period.between(date, LocalDate.now()).getYears();
        boolean resitMi = (yas < 18) ? false : true;
        return resitMi;
    }

    //kullanıcıdan doğum tarihini belli kontrollerle alıyoruz.
    private static LocalDate dogumTarihiAl() {
        while (true) {
            System.out.print("Lutfen dogum tarihinizi yil-ay-gun seklinde giriniz: ");
            String date = scanner.next();
            try {
                LocalDate localDate = LocalDate.parse(date); //string formatını tarihe çeviriyor.
                return localDate;
            } catch (Exception e) { //başarılı bşr şekilde giriş olmadıysa catch'e düşecek ve böylelikle while tekrar tekrar girip döngüde dönmüş olacağız.
                System.out.println("Lutfen dogum tarihinizi yil-ay-gun formatinda giriniz...");
            }
        }
    }
}
