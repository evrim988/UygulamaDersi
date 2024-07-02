package week02.day01;

import java.util.Scanner;

public class Example007 {
    public static void main(String[] args) {

        int factoriyel = 1, sayi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        sayi = scanner.nextInt();
        for (int i = 1; i <= sayi; i++) {
            factoriyel = factoriyel * i;
        }

        System.out.println("girilen sayının faktöriyeli: " + factoriyel);
        scanner.close();
    }
}
