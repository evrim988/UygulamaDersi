package week02.day04;

public class StringMethods {
    public static void main(String[] args) {

        String value = "Merhaba Dunya";
        System.out.println(value.charAt(2)); //yazılan metinin 2.indisindeki karakteri ekrana yazdırır.

        String valueTrim = " Merhaba Dunya ";
        System.out.println(valueTrim.trim()); //string bir ifadenin başında ya da sonunda olan boşlukları kaldırır.


        System.out.println(value.length()); // string ifadenin uzunluğunun sayısını verir.

        System.out.println(value.indexOf('b')); //string ifadede b harfinin ilk görüldüğü index'i verir.

        System.out.println(value.lastIndexOf('a')); //string ifadede ki a harfinin görüldüğü son index deki sayıyı verir.

        System.out.println(value.substring(4)); //string ifade de 4.index den sonraki ifadeleri getirir.(0,1,2..)

        System.out.println(value.substring(0,5)); //string ifade de 0.index den 5. index e kadar olan ifadeyi yazdırır.

        System.out.println(value.equals(valueTrim)); //iki string ifadeyi karşılaştırıyor.

        System.out.println(valueTrim.trim().equals(value)); //boşlukları kaldırıp öyle karşılaştırma yapıyor.
    }
}
