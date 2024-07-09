package week03.day01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SoruMenu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int selection;
        boolean menuControl = true;

        while (menuControl){

            System.out.println("-----String Operasyonları---------");
            System.out.println("1-> Kelime Sayısı");
            System.out.println("2-> Kelime Değiştirme");
            System.out.println("3-> Polindrom Kontrol");
            System.out.println("4-> Sayfalama");
            System.out.println("0-> Çıkış");
            System.out.print("Lütfen bir seçim yapımız: ");

            try {
                selection = scanner.nextInt();
                scanner.nextLine();
            }
            catch (InputMismatchException e){

                System.out.println("Lütfen geçerli bir sayı değeri giriniz.");
                scanner.nextLine();
                continue;

            }/*finally {
                System.out.println("Finally bloğu");
            }*///bu blok her halükarda çalışır. Hata olsun veya olmasın

            switch (selection){
                case 1: {
                    System.out.println("\n------Kelime Sayma------");
                    System.out.println("Lutfen bir kelime giriniz: ");
                    String kelime = scanner.nextLine();
                    System.out.println("Lutfen bir harf giriniz: ");
                    char harf = scanner.nextLine().charAt(0);
                    int sayi = 0;

                    if(kelime.contains(String.valueOf(harf))){
                        System.out.println("\nGirdiğiniz kelimede " + harf + " harfi bulunmamaktadır.");
                        break;
                    }
                    for (int i = 0; i < kelime.length(); i++) {
                        if(kelime.charAt(i) == harf) {
                            sayi++;
                            System.out.println("Girdiğiniz kelimede " + harf + " harfi " + i + " .index de bulunmaktadır.");
                        }
                    }
                    System.out.println("Girdiğiniz kelimede " + harf + " harfi " + sayi + " tane bulunmaktadır.");

                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    break;
                }
                case 0:{
                    System.out.println("Program sonlandırılıyor.");
                    menuControl = false;
                    break;
                }
                default:
                    System.out.println("Lütfen geçerli bir değer giriniz: ");
                    break;
            }

        }

    }
}
