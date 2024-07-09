package week03.day01;

import java.util.Scanner;

public class Soru01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean entryMenuStatus = true;

        while (entryMenuStatus){

            System.out.println("Hosgeldiniz!");
            System.out.println("Lutfen menuden bir secim yapiniz.");
            System.out.println("1- ");
            System.out.println("2-");
            System.out.println("3-");
            System.out.println("4-");
            System.out.println("0 -> Cikis");
            System.out.print("Seciminiz: ");
            int select = scanner.nextInt();
            scanner.nextLine();
            switch (select){

                case 1: {
                    System.out.print("Bir kelime giriniz: ");
                    String kelime = scanner.nextLine();
                    System.out.print("Bir harf giriniz: ");
                    String harf = scanner.next();


                    int harfSayisi = 0;
                    char karakter;
                    if(kelime.contains(harf)){
                        for (int i = 0; i < kelime.length(); i++) {
                            karakter = kelime.charAt(i);
                            if(harf.indexOf(karakter) != -1)
                                harfSayisi++;
                        }
                        System.out.println("Girdiginiz kelimede bulunan harf sayisi: " + harfSayisi );
                    }
                    break;
                }
                case 2:{
                    System.out.println("Bir kelime giriniz: ");
                    String kelime = scanner.nextLine();
                    System.out.println("Degistirmek istediginiz harfi giriniz: ");
                    String harf = scanner.next();

                    char karakter;
                    char harfKarakter;
                    for (int i = 0; i < kelime.length(); i++) {
                        karakter = kelime.charAt(i);



                    }


                    break;
                }

                case 0:
                    entryMenuStatus = false;
                    System.out.println("Program Sonlandiriliyor...");
                    break;
            }

        }

    }
}
