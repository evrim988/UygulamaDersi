package week05.day03;

import week04.day03.Kullanici;

import java.util.Arrays;

public class KullaniciOzelListe {

    private week04.day03.Kullanici[] kullaniciDizisi;
    private int boyut;

    KullaniciOzelListe(){
        kullaniciDizisi = new week04.day03.Kullanici[0];
}

    public week04.day03.Kullanici[] getKullaniciDizisi() {
            return kullaniciDizisi;
    }

    public week04.day03.Kullanici add(week04.day03.Kullanici kullanici){
        week04.day03.Kullanici[] tmp;
            tmp = new week04.day03.Kullanici[this.boyut+1];
            for (int i = 0; i<boyut; i++){
                tmp[i] = kullaniciDizisi[i];
            }
            tmp[this.boyut] = kullanici;
            kullaniciDizisi = tmp;
            this.boyut++;
        return kullaniciDizisi[boyut-1];
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
                week04.day03.Kullanici[] tmp = new week04.day03.Kullanici[this.boyut - 1];
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
                System.out.println("Dizide cikarilabilecek eleman bulunmamaktadir. ( Dizi BOS!! ) ");
            }
        }

    }

    public void list(){
        System.out.print("{");
        for (int i = 0; i<boyut; i++){
            System.out.print(kullaniciDizisi[i]);
            if(i != boyut-1){
                System.out.print(",");
            }
        }
        System.out.println("}");
    }

    public void addAll(week04.day03.Kullanici[] sayiDizisi){
        for (int i = 0; i<sayiDizisi.length;i++){
            add(sayiDizisi[i]);
        }
    }
    public void removeAllIndexes(int[] indexesToBeRemoved){
       Arrays.sort(indexesToBeRemoved);
        for (int i = indexesToBeRemoved.length-1; i>=0;i--){
            remove(indexesToBeRemoved[i]);
        }
    }

    public week04.day03.Kullanici replace(int index, Kullanici kullanici) {
      return kullaniciDizisi[index] = kullanici;
    }
}
