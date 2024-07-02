package week02.day01;

public class Example002 {
    public static void main(String[] args) {


        double amount = 100;
        double exchangeRate = 32.68;
        float exchange = (float) (amount / exchangeRate);
        System.out.println(amount+ "TL " + exchange + " Dolara eşittir.");
    }
}

/* Soru : Türk lirasını dolara çevirelim.
* amount miktar adında bir değişken tanımladık.
* exchangeRate adında güncel dolar kurunu tanımladık.
* exchange de sonucu belirttik.
* en sonunda çıktı verip programı sonlandırdık.
* */