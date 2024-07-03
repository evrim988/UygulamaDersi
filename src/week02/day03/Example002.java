package week02.day03;

import java.util.Scanner;

public class Example002 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen dogum tarihinizi ay olarak giriniz:  ");
        int ay = scanner.nextInt();
        System.out.print("Lütfen dogum tarihinizi gun olarak giriniz:  ");
        int gun = scanner.nextInt();

        if(ay > 12 && gun >31){
            System.out.println("Lutfen ay ve gun degerlerini kontrol edin.");
        } else if ((ay >= 03 && gun >= 21) && (ay <= 04 && gun <= 20)) {
            System.out.println("Koç Burcu");
        }
        else if((ay >= 4 && gun >= 21) && (ay <= 5 && gun <= 21)){
            System.out.println("Boğa Burcu");
        } else if ((ay >=5 && gun >= 22) && (ay <= 6 && gun <= 22 )) {
            System.out.println("İkizler Burcu");
        }
        else if((ay >= 6 && gun >= 23) && (ay <= 7 && gun <= 22)){
            System.out.println("Yengeç Burcu");
        } else if ((ay >= 7 && gun >= 23) && (ay <= 8 && gun <= 22)) {
            System.out.println("Aslan Burcu");
        } 
        else if((ay >= 8 && gun >= 23) && (ay <= 9 && gun <= 22)){
            System.out.println("Başak Burcu");
        }
        else if ((ay >= 9 && gun >= 23) && (ay <= 10 && gun <= 22)) {
            System.out.println("Terazi Burcu");
        } else if ((ay >= 10 && gun >= 23) && (ay <= 11 && gun <= 21)) {
            System.out.println("Akrep Burcu");
        } else if ((ay >= 11 && gun >= 22) && (ay <= 12 && gun <= 21)) {
            System.out.println("Yay Burcu");
        } else if ((ay >= 12 && gun >= 22) && (ay <= 01 && gun <= 21)) {
            System.out.println("Oğlak Burcu");
        } else if ((ay >= 01 && gun >= 22) && (ay <= 02 && gun <= 19)) {
            System.out.println("Kova Burcu");
        } else if ((ay >= 02 && gun >= 20) && (ay<= 03 && gun <= 20)) {
            System.out.println("Balık Burcu");
        } else  {
            System.out.println("ay ve gun degerleri 0 olamaz.");
        }
    }
}
/*
2- Dışarıdan ay ve gün değerini ayrı ayrı bir sayı olarak alacaksınız buna göre bur. hesabı yapan program

Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart
 like 4

3- Girilen sayının mükemmel sayı olup olmadığını gösteren program.

* */