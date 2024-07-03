package week02.day04Homework;


import java.util.Scanner;

public class MenuOlusturma {
    public static void main(String[] args) {

        System.out.println("Hoşgeldiniz! Welcome");

        Scanner scanner = new Scanner(System.in);


        System.out.println("Lutfen menuyu goruntulemek istediginiz dili seciniz. / Please select display language.");
        System.out.println("1-- Turkish (TR)");
        System.out.println("2-- English (EN)");
        System.out.print("Secmek istediginiz dilin numarasini yaziniz: ");
        int choose = scanner.nextInt();
        boolean isTrue = true;

        while (isTrue) {
            if (choose == 1) {
                System.out.print("\n0 -> Çıkış Yap \n"
                        + "1 -> Merhaba Dünya Yazdır\n"
                        + "2 -> Faktoriyel Hesapla\n"
                        + "3 -> Asal sayı kontrolü yap.\n");
                System.out.print("Menuden bir secim yapin: ");
                int menuChoose = scanner.nextInt();

                switch (menuChoose) {
                    case 0:
                        System.out.println("Menuden cikis yapiliyor. Lutfen bekleyiniz...");
                        scanner.close();
                        System.exit(0);
                    case 1:
                        System.out.println("\nMerhaba Dünya!\n");
                        break;
                    case 2:
                        System.out.println("\nFaktöriyel hesaplama...");
                        System.out.print("Bir sayi giriniz: ");
                        int numberFactorial = scanner.nextInt();
                        long fact = 1;
                        for (long i = 1; i <= numberFactorial; i++) {
                            fact *= i;
                        }
                        System.out.println(numberFactorial + " sayısının faktöriyeli: " + fact);
                        break;
                    case 3:
                        System.out.println("\nAsal Sayi Kontrolü...");
                        System.out.print("Bir sayi giriniz: ");
                        int primeNumber = scanner.nextInt();
                        boolean isPrime = true;

                        if (primeNumber <= 1) {
                            System.out.println(primeNumber + " sayısı asal sayı değildir.");
                        } else if (primeNumber == 2) {
                            System.out.println(primeNumber + " sayısı asal sayıdır.");
                        } else {
                            for (int i = 3; i < primeNumber / 2; i += 2) {
                                if (primeNumber % i == 0) {
                                    isPrime = false;
                                    break;
                                }
                            }
                            if (isPrime) {
                                System.out.println(primeNumber + " sayısı asal sayıdır.");
                            } else {
                                System.out.println(primeNumber + " sayısı asal sayı değildir.");
                            }
                        }
                        break;
                }

            } else if (choose == 2) {

                System.out.print("\n0 -> Exit \n"
                        + "1 -> Hello World Print!\n"
                        + "2 -> Calculate factorial\n"
                        + "3 -> Check prime number.\n");
                System.out.print("Make a choice from the menu: ");
                int secondMenuChoose = scanner.nextInt();


                switch (secondMenuChoose) {
                    case 0:
                        System.out.println("Exiting from the menu. Please wait...");
                        scanner.close();
                        System.exit(0);
                    case 1:
                        System.out.println("\nHello World!\n");
                        break;
                    case 2:
                        System.out.println("\nCalculate factorial...");
                        System.out.print("Enter a number: ");
                        int numberFactorial = scanner.nextInt();
                        long fact = 1;
                        for (long i = 1; i <= numberFactorial; i++) {
                            fact *= i;
                        }
                        System.out.println(numberFactorial + " factorial of the number: " + fact);
                        break;
                    case 3:
                        System.out.println("\nPrime Number Check...");
                        System.out.print("Enter a number: ");
                        int primeNumber = scanner.nextInt();
                        boolean isPrime = true;

                        if (primeNumber <= 1) {
                            System.out.println(primeNumber + " The number is not a prime number.");
                        } else if (primeNumber == 2) {
                            System.out.println(primeNumber + " number is a prime number.");
                        } else {
                            for (int i = 3; i < primeNumber / 2; i += 2) {
                                if (primeNumber % i == 0) {
                                    isPrime = false;
                                    break;
                                }
                            }
                            if (isPrime) {
                                System.out.println(primeNumber + " number is a prime number.");
                            } else {
                                System.out.println(primeNumber + " The number is not a prime number.");
                            }
                        }
                        break;
                }


            } else {
                System.out.println("\nGecersiz bir sayi girdiniz. Lutfen tekrar deneyin. You entered an invalid number. Please try again.\n");
                isTrue = false;
            }
        }

    }


}


