package week03.day05;

import java.util.Random;
import java.util.Scanner;

public class Ornek01 {
    public static void main(String[] args) {

       String[] tkm = {"tas","kagit","makas"};

       application(tkm);

    }

    private static void application(String[] tkm) {
        Scanner scanner = new Scanner(System.in);
        String kontrol = ""; // E/H
        int userSkor = 0;
        int pcSkor = 0;

        do {
            String pcSecim = rastgeleSecim(tkm);


            System.out.print("Tekrar oynamak icin 'E' harfini giriniz: ");
            kontrol = scanner.nextLine();
        }while (kontrol.equalsIgnoreCase("E"));

    }


    private static String rastgeleSecim(String[] tkm) {
        Random random = new Random();
        String pcSecim = tkm[random.nextInt(tkm.length)];
        return pcSecim;
    }

}
