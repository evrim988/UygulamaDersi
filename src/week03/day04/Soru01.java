package week03.day04;

import java.util.Arrays;
import java.util.Scanner;

public class Soru01 {
    public static void main(String[] args) {

        /*Girilen kelimedeki Turkce karakterleri, Ingilizce karakterlere ceviren bir program yazalım.
		String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
		String[] turkceKarakter = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };

Örnegin;

Çadır - > Cadir*/



        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz: ");
        String kelime = scanner.nextLine();

        System.out.println(turkceKelimeCevir(kelime));
    }

    public static String turkceKelimeCevir(String kelime) {
        String[] ingilizceKarakter = {"I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O"};
        String[] turkceKarakter = {"İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö"};
        for (int i = 0; i < turkceKarakter.length; i++) {
            kelime = kelime.replace(turkceKarakter[i],ingilizceKarakter[i]);
        }
        return kelime;
    }

}
