package week02.day04;

import java.util.Scanner;

public class Example001 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("bir seyler yaziniz: ");
        String kelime = scanner.nextLine();

        for (int i = 0; i < kelime.length(); i++) {
           char karakter =  kelime.charAt(i);
            System.out.println(karakter + " -> " + i);
        }

    }
}
