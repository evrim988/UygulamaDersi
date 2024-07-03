package week02.day03;

import java.util.Scanner;

public class Example003 {

    /*Girilen sayının mükemmel sayı olup olmadığını gösteren program.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Mukemmel sayiyi bulmak için bir deger giriniz: ");
        int sayi = scanner.nextInt();

        int toplam = 0;

        for (int i = 1; i <= sayi / 2; i++) {
           // System.out.println(i); // girdiğimiz sayının yarısını aldı. yarısına kadar olan sayıların çıktısını verdi.
            if(sayi % i == 0)
            {
                toplam = toplam + i;
            }
        }
        if(toplam == sayi){ // bölümünden kalan sayıların toplamı kendisine eşitse mükemmel sayı oluyor.
            System.out.println("girilen "+ sayi + " sayisi mukemmel bir sayidir.");
        }
        else {
            System.out.println("girilen " + sayi + " sayisi mukemmel bir sayi degildir.");
        }
    }
}
