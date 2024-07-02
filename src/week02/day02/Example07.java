package week02.day02;

import java.util.Scanner;

public class Example07 {
    public static void main(String[] args) {
        //Girilen sayının 5'in kuvveti olup olmadığını bulan program.

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("lütfen bir sayi giriniz: ");
        double number = scanner.nextInt();
        System.out.println("girdiginiz sayi: " + number);

        if(number != Math.pow(number,5)){
            System.out.println("girdiğiniz sayı: "+number + " 5 in kuvvetidir.");
        }*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        int number = scanner.nextInt();
        boolean control = true;
        int power = 0;
        int tempNumber = number;
        while (control){
            if(tempNumber % 5 ==0) {
                tempNumber =  tempNumber / 5;
                power++;
            }
            else if(tempNumber == 1) {
                break;
            }
            else {
                control = false;
            }
        }
        if(control){
            System.out.println("girdiginiz: " + number + " sayisi 5 in " + power + " . kuvvetidir.");
        }
        else {
            System.out.println("girdiginiz: " + number + " sayisi 5 in kuvveti degildir.");
        }
    }
}
