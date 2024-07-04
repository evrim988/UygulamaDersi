package week02.day03Homework;

import java.util.Scanner;

public class MenuOlusturmaV2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        boolean entryMenuStatus = true;

        while (entryMenuStatus)
            System.out.println("Hoşgeldiniz! / Welcome!");
            System.out.println("Lutfen goruntuleme dilini seciniz. / Please select display language.");
            System.out.println("1 -- Turkısh (TR)\n2-- Englısh (EN)\n0-- Cikis / Exit");
            System.out.print("Seciminiz: / Your Selection: ");
            int selection = scanner.nextInt();
        switch (selection) {
            case 1: {
                //türkçe işlevsellikler
                break;
            }
            case 2: {
                //ing işlevsellikler.
                break;
            }
            case 0: {
                entryMenuStatus = false;
                System.out.println("Program sonlandırıldı.");
                break;
            }
            default: {

            }
        }
    }
}
