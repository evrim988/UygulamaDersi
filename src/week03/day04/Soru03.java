package week03.day04;

import java.util.Scanner;

public class Soru03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = scanner.nextInt();

        System.out.println(bolum(sayi));

    }

    public static int toplam(int sayi){
        return sayi + 50;
    }

    public static int carpim(int sayi){
        return toplam(sayi) * 30;
    }

    public static int cikarma(int sayi){
        return carpim(sayi) - 40;
    }

    public static double bolum(int sayi){
        return (double) cikarma(sayi) / 20;
    }
}
