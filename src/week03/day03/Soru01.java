package week03.day03;

import java.util.Scanner;

public class Soru01 {
    public static void main(String[] args) {

        /*İki sayıyla 4 işlem yapabilen bir hesap makinesi uygulaması yapalım.
         Uygulama kullanıcı çıkış yapmadıgı sürece çalışmaya devam edecek. 4 işlem için metotlardan faydalanalım.*/

        Scanner scanner = new Scanner(System.in);
        int selection;
        boolean menuControl = true;

        while (menuControl) {

            System.out.println("--Hoşgeldiniz! Menüden seçim yapınız...");
            System.out.println("1 -> İki Sayıyla Toplama İşlemi ");
            System.out.println("2 -> İki Sayıyla Çıkarma İşlemi");
            System.out.println("3 -> İki Sayıyla Çarpma İşlemi");
            System.out.println("4 -> İki Sayıyla Bölme İşlemi");
            System.out.println("5 -> Çıkış");
            System.out.print("Seçiminiz: ");
            selection = scanner.nextInt();

            switch (selection){
                case 1: {
                    System.out.println("-----İki Sayının Toplamı-----");
                    System.out.print("Lütfen birinci sayıyı giriniz: ");
                    int sayi = scanner.nextInt();
                    System.out.print("Lütfen ikinci sayıyı giriniz: ");
                    int sayi2 = scanner.nextInt();
                    System.out.println("\niki sayının toplamı: " + toplam(sayi, sayi2));
                    System.out.println();
                    break;

                }
                case 2: {
                    System.out.println("----------İki Sayı İle Çıkarma İşlemi-------");
                    System.out.print("Lütfen birinci sayıyı giriniz: ");
                    int sayiCikarma = scanner.nextInt();
                    System.out.print("Lutfen ikinci sayıyı giriniz: ");
                    int sayiCikarma2 = scanner.nextInt();
                    System.out.println("\nÇıkarma işleminin sonucu: " + cikarma(sayiCikarma, sayiCikarma2));
                    System.out.println();
                    break;
                }
                case 3: {
                    System.out.println("-------İki Sayı İle Çarpma İşlemi------");
                    System.out.print("Lütfen birinci sayıyı giriniz: ");
                    int sayiCarpma = scanner.nextInt();
                    System.out.print("Lutfen ikinci sayıyı giriniz: ");
                    int sayiCarpma2 = scanner.nextInt();
                    System.out.println("\nİki sayının çarpımı: " + carpma(sayiCarpma, sayiCarpma2));
                    System.out.println();
                    break;
                }
                case 4: {
                    System.out.println("-------İki Sayı İle Bolme İşlemi-----");
                    System.out.print("Lutfen birinci sayiyi giriniz: ");
                    int sayiBolme = scanner.nextInt();
                    System.out.print("Lutfen ikinci sayıyı giriniz: ");
                    int sayiBolme2 = scanner.nextInt();
                    System.out.println("\nİki sayının bolumu:  " + bolme(sayiBolme, sayiBolme2));
                    System.out.println();
                    break;
                }
                case 5: {
                    System.out.println("Program sonlandırılıyor...");
                    menuControl = false;
                    break;
                }
                default:{
                    System.out.println("Hatalı bir giriş yaptınız. Lütfen tekrar deneyin...");
                    break;
                }
            }

        }

    }

    public static int toplam(int sayi1, int sayi2){
        return sayi1 + sayi2;
    }

    public static int cikarma(int sayi1, int sayi2){
        return sayi1 - sayi2;
    }

    public static int carpma(int sayi1, int sayi2){
        return sayi1 * sayi2;
    }

    public static double bolme(int sayi1, int sayi2){
        return (double) sayi1 / sayi2;
    }
}
