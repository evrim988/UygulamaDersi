package week02.day02;

import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {
        //Kulanıcının girdiği sayının çarpım tablosunu yazdıran program.
        // (Kullanıcı 7 girdiğinde 7'nin çarpım tablosu elemanları görünecek.

        Scanner scanner = new Scanner(System.in);
        System.out.print("lutfen bir sayi giriniz: ");
        int number = scanner.nextInt();

        for (int i = 1; i <=10 ; i++) {
            System.out.println(i + "\tx\t " + number + "\t=\t" + (i * number) );
        }
    }
}
