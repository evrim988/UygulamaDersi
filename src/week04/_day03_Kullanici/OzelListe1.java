package week04._day03_Kullanici;

public class OzelListe1 {

    private int[] sayiDizisi;

    private int boyut; //veri kadar boyutu olacağı için getter ve setterları kaldırdık.

    //getter and setter
    public int[] getSayiDizisi() {
        return sayiDizisi;
    }

    //add isimli metod yazalım. Bu metot kullanıcının dışarıdan parametre olarak verdiği int türünde sayiyi alacak ve sayimizi dizimize ekleyecek
    public void add(int sayi){
        int[] tmp; //geçici bir dizi oluşturduk.
        if(sayiDizisi == null){
            sayiDizisi = new int[1]; //boyutu 1 olan dizi tanımladık.
            sayiDizisi[0] = sayi; //ilk indexine sayiyi verdik.
            this.boyut = 1; //boyutun başlangıç değerini belirledik.
        }
        else { //boyut +1 = 2 demek oluyor daha önceden 0,1 oldupu için +1 dediğimde 2 oluyor.
            tmp = new int[this.boyut + 1]; //sayi dizimizin önceki boyutunun 1 fazlası olacak. Çünkü yeni eleman ekliyoruz. Bunu geçici tempde yaptık.
            for (int i = 0; i < boyut; i++) { //boyut olana kadar
                tmp[i] = sayiDizisi[i]; //önceki dizimizi yeni diziye aktarmış olduk.

            }
            tmp[this.boyut] = sayi; //boyut 2 olduğu için 2.indexe sayi değerini ekliyor.
            sayiDizisi = tmp; //eski diziyi geçici diziye atadık. önceki diziyi kaldırmış oldu.
            boyut++;
        }
    }
    //remove isimli bir metod yazalım. Bu metod kullanıcının dışarıdan parametre olarak verdiği index'i silecek.
    public void remove(int index){
        int[] tmp = new int[this.boyut-1];
        for (int i = 0; i < boyut; i++) {
            if(i < index)
                tmp[i] = sayiDizisi[i];
            else {
                tmp[i] = sayiDizisi[i + 1];
            }
        }
    }

}
