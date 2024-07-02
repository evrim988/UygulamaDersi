package week02.day01;

import java.util.Scanner;

public class Example001 {
    public static void main(String[] args) {

        float rawPrice =  0, price = 100, vatRatio = 0.18f, profitRatio = 0.15f, priceWithoutVat;
        priceWithoutVat = price-(price * vatRatio);
        System.out.println("KDV'siz Fiyat: " + priceWithoutVat);
        rawPrice = priceWithoutVat - (priceWithoutVat * profitRatio);
        System.out.println("Ham Fiyat: " + rawPrice);
    }
}
 /*
 * Bir ürünün fiyatında %18 KDV ve %15 KAR olduğunu biliyoruz.
 * bir ürün fiyatım olsun. bu ürün fiyatından ham fiyatını bulalım.

 * float değer olarak hamfiyat tanımladık(rawPrice). Birde fiyat(price), birde kdvsiz fiyat(priceWithoutVat) tanımladık.
 * vatRatio adında kdv belirledik.
 * profitRatio kar miktarı belirledik.
priceWithoutVat = price-(price * vatRatio); kdvsiz fiyatı bulduk.
*         rawPrice = priceWithoutVat - (priceWithoutVat * profitRatio);
burdan da ham fiyatı bulduk.
 * */