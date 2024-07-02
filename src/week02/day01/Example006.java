package week02.day01;

import java.util.Scanner;

public class Example006 {
    public static void main(String[] args) {

        double sayi1, sayi2, toplam, ortalama;
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");
        sayi1 = scanner.nextInt();
        System.out.println("bir sayı giriniz: ");
        sayi2 = scanner.nextInt();
        toplam = sayi1 + sayi2;
        ortalama = (sayi1 + sayi2) / 2;
        if(toplam % 2 == 0){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        System.out.println("İki sayının ortalaması: " + ortalama);
    }
}
