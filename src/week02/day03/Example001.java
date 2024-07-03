package week02.day03;

import java.util.Scanner;

public class Example001 {
    /*
    * Kullanıcıdan 1'den 7'ye kadar bir sayı isteyelim. Bu sayıya denk gelen haftanın gününü çıktı olarak verelim.*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Lutfen 1-7 arasinda bir sayi giriniz: ");
        int number = scanner.nextInt();

        switch (number){

            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                 break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Lütfen 1-7 arasında bir değer giriniz.");
                break;
        }

    }
}
