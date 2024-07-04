package week02.day04;

import java.util.Scanner;

public class Example002 {
    /*Dışarıdan bir değer alacağız. Bu değerin içerisinde kaç tane a harfi oldugunu yazdıracağız.*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir seyler yaziniz: ");
        String kelime = scanner.nextLine();
        char karakter = 'a';
        int count = 0;

        for (int i = 0; i < kelime.length(); i++) {

            if(kelime.charAt(i) == karakter ){
                count++;
            }
        }
        System.out.println(count);
    }
}
