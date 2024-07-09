package week03.day02;

public class Soru03 {
    public static void main(String[] args) {


        int[] numberArrays = {1300,0, 120, 130,125, 85, -256, 16,1258, 81, 14};

        int max =Integer.MIN_VALUE;
        int min = numberArrays[0];
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < numberArrays.length; i++) {

            if(numberArrays[i] > max) {
                secondMax = max;
                max = numberArrays[i];
            } else if (numberArrays[i] > secondMax) {
                secondMax = numberArrays[i];
            }
            else if (numberArrays[i] < min)
                min = numberArrays[i];
        }

        System.out.println("En buyuk deger: " + max);
        System.out.println("İkinci en buyuk sayi: " + secondMax);
        System.out.println("En kucuk deger: " + min);

    }
}
