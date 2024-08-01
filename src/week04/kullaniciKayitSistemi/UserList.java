package week04.kullaniciKayitSistemi;

public class UserList {

    private User[] kullaniciDizisi;

    private int boyut;

    public User[] getKullaniciDizisi() {
        return kullaniciDizisi;
    }

    public User add(User kullanici){
        User[] tmp;
        if(kullaniciDizisi == null){ //eğer kullanıcı dizisi boş ise yeni bir dizi oluşturacak.
            kullaniciDizisi = new User[1];
            kullaniciDizisi[0] = kullanici;
            this.boyut = 1;
        }
        else { //boş değil ise
            tmp = new User[this.boyut + 1];
            for (int i = 0; i < boyut; i++) {
                tmp[i] = kullaniciDizisi[i];
            }
            tmp[this.boyut] = kullanici;
            kullaniciDizisi = tmp;
            this.boyut++;
        }
        System.out.println("Kayit islemi basariyla gerceklestirildi!f");
        return kullaniciDizisi[boyut-1];
    }

    public void Remove(int index){
        if ((this.boyut-1)<index){
            try {
                throw new ArrayIndexOutOfBoundsException("");
            } catch (ArrayIndexOutOfBoundsException e ){
                System.out.println("Dizide "  + index +". eleman bulunmamakta.");
            }
        }else {
            try {
                User[] tmp = new User[this.boyut - 1];
                for (int i = 0; i < tmp.length; i++) {
                    if (i < index) {
                        tmp[i] = kullaniciDizisi[i];
                    } else {
                        tmp[i] = kullaniciDizisi[i + 1];
                    }
                }
                kullaniciDizisi = tmp;
                boyut--;
            } catch (NegativeArraySizeException e) {
                System.out.println("Dizi bos. Silinecek eleman yoktur... ");
            }
        }
    }

    public void list(){
        if(this.boyut == 0){
            System.out.println("Listelenecek bir eleman yok...");
        }
        else{
            for (User user: kullaniciDizisi){
                System.out.println(user);
            }
        }
    }

    public void addAll(User[] kullaniciListesi) {
        for (int i = 0; i < kullaniciDizisi.length ; i++) {
                add(kullaniciListesi[i]);
        }
    }
}
