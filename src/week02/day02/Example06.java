package week02.day02;

import java.util.Scanner;

public class Example06 {
    public static void main(String[] args) {
        //Telefon kodu ve Email kodumuz olsun (Numerik ve bunları elle girebiliriz)
        // Sonrasında kullanıcıdan kodları girmesini isteyeceğiz,
        // e-mail kodu hatalıysa ona göre bir mesaj, sms kodu hatalıysa ona göre bir mesaj,
        // ikisi de doğru girildiğinde de "Başarıyla giriş yaptınız".

        String telCode = "25A50Eaa";
        String emailCode = "69AEY47aa";
        Scanner scanner = new Scanner(System.in);
        System.out.print("telefonunuza gelen kodu giriniz: ");
        String telCodeInput = scanner.nextLine();
        System.out.print("emailinize gelen kodu giriniz: ");
        String emailCodeInput = scanner.nextLine();

        if(!telCode.equals(telCodeInput)) {
            System.out.println("hatalı bir telefon kodu girdiniz.");
        }
        else if (!emailCode.equals(emailCodeInput)) {
            System.out.println("hatalı bir email kodu girdiniz.");
        }
        else {
            System.out.println("tebrikler başarıyla giriş yaptınız.");
        }


    }
}
