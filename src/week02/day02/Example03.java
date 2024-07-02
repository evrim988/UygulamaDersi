package week02.day02;

import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        //Klavyeden 0 girilinceye kadar sayı okumaya devam edelim.
        // 0 girildiğinde sayıların toplamını ve ortalamasını ekrana yazdıralım.

      /*  int total = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayi giriniz: ");
        int sayi = scanner.nextInt();

        for (int i = 1; i <=sayi ; i++) {
            if(sayi == 0)
            {
                total += i;
                System.out.println(total);
            }
        }*/

        Scanner scanner = new Scanner(System.in);
        int input = -1;
        int total = 0;
        int inputCount = 0;

        while (input != 0){
            System.out.println("Lütfen bir sayi giriniz (0 -> Cikis): ");
            input = scanner.nextInt();
            if(input != 0){
                total +=input;
                inputCount++; //girilen sayının sayısını bir arttırdım.
            }
            else if(input == 0){
                System.out.println("Sum: " + total);
                System.out.println("Average: " + (total/inputCount));
            }
        }
//githubdan eksik alanları kontrol et.
    }
}
