package week02.day02;

import java.util.Scanner;

public class AsalSayiOrtaVerimli {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis(); // 2 Temmuz 2024 00:00:00.000
        int timer = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("bir sayi giriniz: ");
        int number = scanner.nextInt();

        if(number <= 1){
            System.out.println("girilen sayi asal degildir.");
        } else if (number == 2) {
            System.out.println("Girilen sayi asal sayidir.");
        } else if(number % 2 == 0){
            System.out.println("girdiginiz sayi: " + number + " asal degildir.");
        }
        else {

            for (int i = 3; i < number / 2; i+=2) {
                if(number % i == 0) {
                    timer++;
                    break;
                }
            }
            if(timer == 0 ){
                System.out.println("girilen " + number + " sayisi asal sayidir.");
            }
            else {
                System.out.println("girilen " + number + " sayisi asal sayi degildir.");
            }
        }
        long endTime = System.currentTimeMillis(); // 2 07 2024 00:00:00.000
        long estimatedTime = endTime - startTime;
        System.out.println("sure: " + estimatedTime);
    }
}
