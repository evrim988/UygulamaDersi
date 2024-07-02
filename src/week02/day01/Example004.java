package week02.day01;

import java.util.Scanner;

public class Example004 {
    public static void main(String[] args) {

        int yas;
        String ad;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Yasinizi giriniz: ");
        yas = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Adinizi giriniz: ");
        ad = scanner.nextLine();
        scanner.close(); //scanner classını kapattık.
        System.out.println("isminiz: " + ad + "," + "yasiniz: " + yas);
    }
}
/*soru 4: Kullanıcıdan önce yaşını, sonrasında da kullanıcının ismini girdi olarak isteyelim.
İsmini ve yaşını ekrana yazdıralım.*/