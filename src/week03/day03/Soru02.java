package week03.day03;

public class Soru02 {
    public static void main(String[] args) {

        /*Bir metot yazalım ve bu metot dizi içindeki tek elemanları alıp,
başka bir diziye atsın ve o diziyi yazdırsın.*/

        int[] intArrays = {1,5,9,10,15,36};
        dizi(1,5,9,10,15,36);
    }

    public static int[] dizi(int... sayilar){
        int[] newArray = new int[5];
        for (int i = 0; i < sayilar.length; i++) {
            if(sayilar[i] % 2 != 0)
                System.out.println(sayilar[i]);
        }

        return sayilar;
    }

}
