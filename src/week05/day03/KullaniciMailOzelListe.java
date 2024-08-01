package week05.day03;

import week04.day03.Kullanici;

public class KullaniciMailOzelListe {

    private KullaniciMail[] kullaniciMailDizisi;
    private int boyut;

    public KullaniciMailOzelListe() {
        kullaniciMailDizisi = new KullaniciMail[0];
    }

    public KullaniciMail[] getKullaniciMailDizisi() {
        return kullaniciMailDizisi;
    }

    public KullaniciMail add(KullaniciMail mail){
       KullaniciMail[] tmp;
        tmp = new KullaniciMail[this.boyut+1];
        for (int i = 0; i<boyut; i++){
            tmp[i] = kullaniciMailDizisi[i];
        }
        tmp[this.boyut] = mail;
        kullaniciMailDizisi = tmp;
        this.boyut++;
        return kullaniciMailDizisi[boyut-1];
    }

    public void remove(int index){

        if ((this.boyut-1)<index){
            try {
                throw new ArrayIndexOutOfBoundsException("");
            } catch (ArrayIndexOutOfBoundsException e ){
                System.out.println("Dizide "  + index +". eleman bulunmamakta.");
            }
        }else {
            try {
                KullaniciMail[] tmp = new KullaniciMail[this.boyut - 1];
                for (int i = 0; i < tmp.length; i++) {
                    if (i < index) {
                        tmp[i] = kullaniciMailDizisi[i];
                    } else {
                        tmp[i] = kullaniciMailDizisi[i + 1];
                    }
                }
                kullaniciMailDizisi = tmp;
                boyut--;
            } catch (NegativeArraySizeException e) {
                System.out.println("Dizide cikarilabilecek eleman bulunmamaktadir. ( Dizi BOS!! ) ");
            }
        }

    }

    public void list(){
        System.out.print("{");
        for (int i = 0; i<boyut; i++){
            System.out.print(kullaniciMailDizisi[i]);
            if(i != boyut-1){
                System.out.print(",");
            }
        }
        System.out.println("}");
    }

    public void addAll(KullaniciMail[] mailDizisi){
        for (int i = 0; i<mailDizisi.length;i++){
            add(mailDizisi[i]);
        }
    }

    public KullaniciMail replace(int index, KullaniciMail kullanici) {
        return kullaniciMailDizisi[index] = kullanici;
    }
}
