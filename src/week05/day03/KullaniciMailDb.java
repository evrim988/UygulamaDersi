package week05.day03;

public class KullaniciMailDb {
    static KullaniciMailOzelListe kullaniciMailOzelListe = new KullaniciMailOzelListe();

    static KullaniciMail save(KullaniciMail kullanici){
        return kullaniciMailOzelListe.add(kullanici);
    }
    static KullaniciMail update(KullaniciMail kullanici){
        KullaniciMail[] kullaniciDizisi = kullaniciMailOzelListe.getKullaniciMailDizisi();
        int index=0;
        for(KullaniciMail user: kullaniciDizisi){
            if(user.getId() == kullanici.getId()){
                return kullaniciMailOzelListe.replace(index,kullanici);
            }
            index++;
        }
        return null;
    }

    static KullaniciMail[] findAll(){
        KullaniciMail[] kullaniciDizisi = kullaniciMailOzelListe.getKullaniciMailDizisi();
        for(KullaniciMail item : kullaniciDizisi){
            System.out.println(item);
        }
        return kullaniciDizisi;
    }

    static KullaniciMail findById(int id){
        KullaniciMail[] kullaniciDizisi = kullaniciMailOzelListe.getKullaniciMailDizisi();
        for(KullaniciMail kullanici : kullaniciDizisi){
            if (kullanici.getId()==id){
                return kullanici;
            }
        }
        return null;
    }


}
