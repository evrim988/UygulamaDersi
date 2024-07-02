package week02.day02;

import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        //2-Dışarıdan taban değeri ve üs isimli 2 tane değişken alınacak. (2 üzeri 5 gibi) tabanın kuvvetini hesaplamak istiyorum.
        //Hesaplamayı yaptıktan sonra, kullanıcıya ismini soracağım. Sonra çıktı olarak; "kullaniciIsmi + "n üzeri x isleminin sonucu " "


      /*  double base = 3;
        double us = 5;
        double total = Math.pow(base,us);
//        System.out.println(total);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen isminizi giriniz: ");
        String name = scanner.nextLine();
        System.out.println("Adınız: " + name + " " +  base +" üzeri " + us + " işleminin sonucu: " + total);*/


        Scanner scanner = new  Scanner(System.in);
        System.out.print("Lütfen bir taban değeri giriniz: ");
        int base = scanner.nextInt();
        System.out.print("Lütfen bir us degeri giriniz: ");
        int power = scanner.nextInt();
        scanner.nextLine();
        long result = 1;
        //burda long diye değişken tuttum çünkü çıkan sonuç büyük olabilir.
        for (int i = 0; i < power; i++) {
            result *= base;
        }
        System.out.print("Lutfen adinizi giriniz: ");
        String name = scanner.nextLine();
        System.out.println(name + " girdigin " + base + " sayisinin " + power + ". kuvveti " + result + " sayisina esittir.");
    }
}
