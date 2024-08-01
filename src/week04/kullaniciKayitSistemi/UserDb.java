package week04.kullaniciKayitSistemi;

public class UserDb {

    static UserList userList = new UserList();

    static User save(User user) {
        return userList.add(user);
    }

    public static User[] findAll() {
        User[] kullaniciDizisi = userList.getKullaniciDizisi();
        if (kullaniciDizisi == null) {
            System.out.println("Kullanici Listesinin Icerigi Bos.");
            return null;
        }
        for (var item : kullaniciDizisi) {
            System.out.println(item);
        }
        return kullaniciDizisi;

    }

    public static boolean emailBul(String mail) {
        User[] userArray = userList.getKullaniciDizisi();
        for (var item : userArray) {
            if (item.getMail().equals(mail))
                return true;
        }
        return false;
    }

    public static boolean tcNoBul(String tcNo) {
        User[] userArray = userList.getKullaniciDizisi();
        if (userArray == null) {
            return false;
        } else {
            for (var item : userArray) {
                if (item.getTcNo().equals(tcNo))
                    return true;
            }
            return false;
        }
    }

    public static boolean kullaniciAdiBul(String kullaniciAdi) {
        User[] userArray = userList.getKullaniciDizisi();
        if(userArray == null){
            return false;
        }
        else {
            for (var item: userArray){
                if(item.getKullaniciAdi().equals(kullaniciAdi))
                    return true;
            }
        }
        return false;
    }

    public static void kullaniciListele(int userIndex){
        User[] userArray = userList.getKullaniciDizisi();
        System.out.println("--------Kullanıcı Bilgileri--------");
        System.out.println("Adınız ve Soyadınız: " + userArray[userIndex].getAd() + " " + userArray[userIndex].getSoyad());
        System.out.println("Email Adresiniz: " + userArray[userIndex].getMail());
        System.out.println("Kullanıcı Adı: " + userArray[userIndex].getKullaniciAdi());
        System.out.println("Telefon Numaranız: " + userArray[userIndex].getTelNo());
        System.out.println("Dogum Tarihiniz: " + userArray[userIndex].getDogumTarihi());
        System.out.println("Kayıt Tarihi: " + userArray[userIndex].getKayitTarihi());
    }
}
