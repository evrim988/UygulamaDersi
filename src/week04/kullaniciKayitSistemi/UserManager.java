package week04.kullaniciKayitSistemi;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class UserManager {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int secim = 0;
        do {
            System.out.println("----------Kullanici Kayit Sistemi-------");
            System.out.println("1 -> Kayıt Ol");
            System.out.println("2 -> Giriş Yap");
            System.out.println("3 -> Şifremi Unuttum");
            System.out.println("4 -> Tüm Kullanıcıları Listele");
            System.out.println("0 -> Çıkış Yap");
            System.out.print("Seçiminiz: ");
            secim = scanner.nextInt();
            kullaniciSecimi(secim);
        } while (secim != 0);
    }

    public static void kullaniciSecimi(int secim) {
        switch (secim) {
            case 1:{
                User user = kullaniciKaydi();
                System.out.println(user);
                break;
            }
            case 2: {
                //login işlemleri
                break;
            }
            case 3: {
                //şifremi unuttum
                break;
            }
            case 4: {
                //kullanıcıları listele
                break;
            }
            case 0: {
                System.out.println("Program sonlanıyor. iyi Gunler...");
                break;
            }

            default: {
                System.out.println("Hatalı giriş yaptınız. Lütfen 0-4 arasında bir değer giriniz...");
            }
        }
    }

    public static User kullaniciKaydi(){
        User kullanici;
        LocalDate dogumTarihi;
        dogumTarihi = dogumTarihiAl();
        if(dogumTarihiKontrol(dogumTarihi)){
            kullanici = new User();
            kullanici.setDogumTarihi(dogumTarihi);
            kullanici.setMail(emailAl());
            kullanici.setSifre(parolaAl());
            kullanici.setKullaniciAdi(kullaniciAdiAl(true));
            kullanici.setTcNo(tcNoAl(true));
            UserDb.save(kullanici);
            return kullanici;
        }
        return null;
    }

    public static String tcNoAl(boolean ilkKayitMi) {
        String tcNo;
        while (true){
            System.out.print("Lutfen TC Kimlik Numaranizi Giriniz: ");
            tcNo = scanner.nextLine();
            if(!numerikDegerKontrol(tcNo)){
                System.out.println("TC Kimlik Numarası Sadece Numerik Deger Barındırır.");
                continue;
            } else if (tcNo.length() != 11) {
                System.out.println("TC Kimlik Numarası 11 Haneli olmalıdır.");
                continue;
            }
            if(ilkKayitMi) {
                if(UserDb.tcNoBul(tcNo)){
                    System.out.println("Bu Tc Numarası Bir Baskasina Ait Lutfen Farkli Bir Deger Giriniz.");
                    continue;
                }
                return tcNo;
            }
            if(!UserDb.tcNoBul(tcNo)){
                System.out.println("Girdigini TC Kimlik Numarasina Ait Bir Kayit Bulunanmamistir.");
                continue;
            }
            return tcNo;
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

    public static String kullaniciAdiAl(boolean ilkKayitMi) {
        String kullaniciAdi;
        while (true) {
            System.out.print("Lutfen Kullanici Adinizi Giriniz: ");
            kullaniciAdi = scanner.nextLine();
            if (kullaniciAdi.length() < 4) {
                System.out.println("Kullanici adi 4 karakterden kucuk olamaz.");
                continue;
            }
            else if (kullaniciAdi.length() > 16) {
                System.out.println("Kullanici adi 16 karakterden buyuk olamaz.!");
                continue;
            }
            if (ilkKayitMi){
                if (UserDb.kullaniciAdiBul(kullaniciAdi)){
                    System.out.println("Bu kullanici adi daha once kullanilmis. Lutfen baska bir kullanici adi deneyin.");
                    continue;
                }
                return kullaniciAdi;
            }
            if (!UserDb.kullaniciAdiBul(kullaniciAdi)){
                System.out.println("Yanlis kullanici adi. Tekrar Deneyiniz...");
                continue;
            }
            return kullaniciAdi;
        }
    }

    public static String parolaAl(){
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

    public static String emailAl(){
        boolean isMailRight = false;
        while (!isMailRight){
            System.out.print("Lutfen email adresinizi giriniz: ");
            String email = scanner.next();
            isMailRight = emailKontrol(email);
            boolean isMailContains = UserDb.emailBul(email);
            if(!isMailContains && isMailRight){
                return email;
            }
            if(isMailContains){
                System.out.println("Lutfen farkli bir email adresi deneyiniz. Bu email adresi daha once kaydedilmis");
                isMailRight = false;
            }

        }
        return null;
    }

    public static boolean emailKontrol(String mail){
        if(!mail.contains("@")){
            System.out.println("Lutfen email adresinizi kontrol ediniz.(email adresi @ icermelidir.)");
            return false;
        }
        return true;
    }

    public static LocalDate dogumTarihiAl(){
        while(true) {
            System.out.print("Lutfen dogum tarihinizi giriniz(yyyy-MM-dd): ");
            String date = scanner.nextLine();
            try {
                LocalDate localDate2 = LocalDate.parse(date);
                return localDate2;
            } catch (Exception e){
                System.out.println("Lutfen dogum tarihinizi yyy-MM-dd formatinda giriniz.");
            }
        }
    }

    public static boolean dogumTarihiKontrol(LocalDate date){
        int yas = Period.between(date,LocalDate.now()).getYears();
        boolean resitMi = (yas < 18) ? false : true;
        return resitMi;
    }

}
