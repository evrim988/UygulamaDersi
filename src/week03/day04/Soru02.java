package week03.day04;

import java.util.Scanner;

public class Soru02 {

    public static void main(String[] args) {
        /*2- Kullanicidan 2 ya da 3 adet sayi alacagiz. (Kullanici belirtecek).

2 sayi girilecekse bir metot icerisinde 2 adet sayi alip, toplama islemini yapip sonucu dondurelim.

3 adet sayi girilecekse ayni isimli overloaded bir metot yazalim ve sayilari disaridan parametre olarak overloaded metoda vererek sayilari toplayalim.

Yani;
Main'de kac sayi alacagini ogren. Gelecek sayi miktarina gore kullanacagin metodu sec ve direktiflere gore metodu tasarla.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir seçim yapınız: ");
        System.out.println("1 -> 2 sayı ile toplama işlemi yapmak");
        System.out.println("2 -> 3 sayı ile toplama işlemi yapmak");
        System.out.print("Seçiminiz: ");
        int selection = scanner.nextInt();

        switch (selection) {

            case 1: {

                System.out.println("İki sayının toplamı: " + toplam());
                break;
            }
            case 2: {
                System.out.print("Birinci sayıyı giriniz: ");
                int sayi1 = scanner.nextInt();
                System.out.print("İkinci sayıyı giriniz: ");
                int sayi2 = scanner.nextInt();
                System.out.print("Üçüncü sayıyı giriniz: ");
                int sayi3 = scanner.nextInt();
                System.out.print("Üç sayının toplamı: " + toplam(sayi1,sayi2,sayi3));
                break;
            }
            default: {
                System.out.println("Hatalı bir giriş yaptınız.");
                break;
            }
        }

    }

    static String toplam(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = scanner1.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner1.nextInt();
        int sonuc = sayi1 + sayi2;
        String islem = sayi1 + " + " + sayi2 + " = " + sonuc;
        return islem;
    }

    static String toplam(int sayi1, int sayi2, int sayi3){
        int islem = sayi1 + sayi2 + sayi3;
        String sonuc = sayi1 + " + " + sayi2 + " + " + sayi3 + " = " + islem;
        return sonuc;
    }
}
