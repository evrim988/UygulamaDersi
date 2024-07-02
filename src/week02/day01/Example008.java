package week02.day01;

import java.util.Scanner;

public class Example008 {
    public static void main(String[] args) {

        int sayi ,toplam = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        sayi = scanner.nextInt();

        for (int i = 1; i <= sayi; i++) {
            toplam = toplam + (i + 1);
        }
        System.out.println("girilen sayıların toplamı: " + toplam);
    }
}

