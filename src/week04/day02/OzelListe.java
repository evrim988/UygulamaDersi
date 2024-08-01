package week04.day02;

import java.util.Arrays;

public class OzelListe {

    private int[] sayiDizisi;
    private int boyut;

    public int[] getSayiDizisi() {
        return sayiDizisi;
    }

    public void add(int sayi){
        int[] tmp;
        if(sayiDizisi == null) {
            sayiDizisi = new int[1];
            sayiDizisi[0] = sayi;
            this.boyut = 1;
        } else {
            tmp = new int[this.boyut + 1];
            for (int i = 0; i < boyut; i++) {
                tmp[i] = sayiDizisi[i];
            }
            tmp[boyut] = sayi;
            sayiDizisi = tmp;
            boyut++;
        }
    }

    public void remove(int index){
        int[] tmp = new int[this.boyut-1];
        for (int i = 0; i < this.boyut; i++) {
            if(i != index)
                tmp[i] = sayiDizisi[i];
            else {
                
            }

        }
        sayiDizisi = tmp;
        boyut--;
    }

    @Override
    public String toString() {
        return "OzelListe{" +
                "sayiDizisi=" + Arrays.toString(sayiDizisi) +
                '}';
    }
}