package week02.day01;

import java.util.Scanner;

public class Example005 {
    public static void main(String[] args) {

        //Dairenin alanını ve çevresini bulalım.
       /* int yaricap;
        Scanner scanner = new Scanner(System.in);
        yaricap = scanner.nextInt();
        System.out.println("Lütfen Çemberin Yarıçap Uzunluğunu Giriniz: ");
        System.out.println("Çemberin Çevresi: " + ( 2 * 3.14 * yaricap));
        System.out.println("Çemberin Alanı: " + (3.14 * (yaricap * yaricap)));
*/
        final double PI = Math.PI;
        double radius;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir yaricap giriniz: ");
        radius = scanner.nextDouble();
        scanner.close();
        double calculatedArea = PI * radius * radius;
        double circumference = 2 * PI * radius;
        System.out.println("Dairenin alanı: " + calculatedArea + "\nDairenin Cevresi: " + circumference);
    }
}
