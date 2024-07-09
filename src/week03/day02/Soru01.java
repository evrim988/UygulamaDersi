package week03.day02;

import java.util.Arrays;
import java.util.Scanner;

public class Soru01 {
    public static void main(String[] args) {

        /*Dışarıdan girilen ülke ismi bizim array'imizde bulunuyor mu? Kontrol edelim.
-> Türkiye, Japonya, Moğolistan, Amerika, Rusya, Çin*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir ulke ismi giriniz: ");
        String country = scanner.nextLine();

        String[] countryArrays = {"Türkiye","Japonya","Moğolistan","Amerika","Rusya","Çin"};

        for (int i = 0; i < countryArrays.length; i++) {

            if(countryArrays[i].equalsIgnoreCase(country)) {
                System.out.println("Ülke bulunuyor.");
                break;
            } else if (countryArrays[1].equalsIgnoreCase(country)) {
                System.out.println("Ülke bulunuyor");
                break;
            }
            else if (countryArrays[2].equalsIgnoreCase(country)) {
                System.out.println("Ülke bulunuyor");
                break;
            }
            else if (countryArrays[3].equalsIgnoreCase(country)) {
                System.out.println("Ülke bulunuyor");
                break;
            }
            else if (countryArrays[4].equalsIgnoreCase(country)) {
                System.out.println("Ülke bulunuyor");
                break;
            }
            else if (countryArrays[5].equalsIgnoreCase(country)) {
                System.out.println("Ülke bulunuyor");
                break;
            }
            else {
                System.out.println("girdiğiniz değerde ülke bulunmuyor.");
                break;
            }
        }
        //hocanın çözümü

        String[] countryArray = {"Türkiye","Japonya","Moğolistan","Amerika","Rusya","Çin"};
        System.out.print("Bir ulke ismi giriniz: ");
        String city = scanner.nextLine();
        boolean isCityPresent = false;

        for (int i = 0; i < countryArray.length; i++) {
            if (countryArray[i].equalsIgnoreCase(city)){
                isCityPresent=true;
                break;
            }
        }
        if(isCityPresent)
            System.out.println("Ulke dizi icinde bulunuyor.");
        else
            System.out.println("Ulke dizi icinde bulunmuyor.");

    }
}
