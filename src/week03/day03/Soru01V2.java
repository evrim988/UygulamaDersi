package week03.day03;

import java.awt.*;
import java.util.Scanner;

public class Soru01V2 {
    public static void main(String[] args) {

        menu();

    }

    private static void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean menuStatus = true;
        int selection;
        while (menuStatus) {
            System.out.println("------CALCULATER----------");
            System.out.println(" 1 -> Summation");
            System.out.println(" 2 -> Subtraction");
            System.out.println(" 3 -> Multiplication");
            System.out.println(" 4 -> Division");
            System.out.println(" 0 -> Exit");
            System.out.print("Please select an option: ");
            selection = scanner.nextInt();
            scanner.nextLine();

            switch (selection) {
                case 1:{
                    System.out.println("\n----SUMMATİON----");
                    System.out.print("Please enter the first number: ");
                    int number1 = scanner.nextInt();
                    System.out.print("Please enter the second number: ");
                    int number2 = scanner.nextInt();
                    int sum = sumTwoNumbers(number1, number2);
                    System.out.println(number1 + " + " + number2 +  " = " + sum + "\n");
                    break;
                }
                case 2: {
                    System.out.println("\n----SUBTRACTİON----");
                    System.out.print("Please enter the first number: ");
                    int number1 = scanner.nextInt();
                    System.out.print("Please enter the second number: ");
                    int number2 = scanner.nextInt();
                    subtractToNumbers(number1, number2);
                    break;
                }
                case 3: {
                    System.out.println("\n----MULTIPLICATION----");
                    int total = multiplyTwoNumbers();
                    break;
                }
                case 4: {
                    break;
                }
                case 0: {
                    menuStatus = false;
                    break;
                }
            }
        }
    }

    private static int multiplyTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        int number2 = scanner.nextInt();
        int multipy = number1 * number2;
        System.out.println(number1 + " * " + number2 +  " = " + multipy + "\n");
        return multipy;

    }

    private static void subtractToNumbers(int number1, int number2) {
        int sub = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + sub);
    }

    private static int sumTwoNumbers(int number1, int number2) {
        return number1 + number2;
    }
}
