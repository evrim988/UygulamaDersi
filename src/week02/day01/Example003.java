package week02.day01;

import java.util.Scanner;

public class Example003 {
    public static void main(String[] args) {



       /* Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen adınızı giriniz: ");
        name = scanner.nextLine();
        System.out.print("Lütfen soyadınızı giriniz: ");
        surName = scanner.nextLine();
        System.out.println("Merhaba: "+ name + "\n " + surName);*/

        //Soru1: İki tane string değişken, (isim ve soyisim), bu değişkenleri yazdıralım.
        String name= "Evrim", surName= "Çalışkan";
        System.out.println("Adınız: " + name + " , " + "Soyadınız: " + surName);

        //Soru 2: bu değişkenleri tek bir çıktıda alt alta yazdıralım.
        name = "Evrim";
        surName = "Çalışkan";
        System.out.println("Adınız: " + name + "\n" + "Soyadınız: " + surName);
        System.out.println("Isım\t\t Soyisim");
        System.out.println(name + "\t\t" + surName);

        //soru 3: a ve b karakterlerinin değerini ve karakterler değer toplamını yazdıralım.
        char a = 'a', b = 'b';
        System.out.println((int) a);
        System.out.println((int) b);
        System.out.println("İki karakterin Toplamı: " + (a+b));

        char aa = (char) (a-32);
        System.out.println((int)aa);
    }
}


