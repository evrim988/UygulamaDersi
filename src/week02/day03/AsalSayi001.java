package week02.day03;

import java.util.Scanner;

public class AsalSayi001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        long number = scanner.nextLong();
        boolean isPrime = true;
        long startTime; //başlangıç zamanı
        long endTime; //bitiş zamanı
        long timeElapsed; //geçen süre

        if(number<=1){
            System.out.println(number + " sayısı asal sayı degildir.");
        } else if (number == 2) {
            System.out.println(number + " sayısı asal sayıdır.");
        }
        else {
            startTime = System.nanoTime();
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            endTime = System.nanoTime();
            timeElapsed =(endTime - startTime)/1000000;
            if(isPrime){
                System.out.println(number + " sayısı asal sayıdır." + "geçen süre: " + timeElapsed );
            }
            else {
                System.out.println(number + " sayısı asal sayı degildir." + "geçen süre: " + timeElapsed );

            }
        }

    }
}
