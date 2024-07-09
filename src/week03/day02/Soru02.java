package week03.day02;

public class Soru02 {
    public static void main(String[] args) {

        int[] numberArrays = {0, 120, 5, 85, -256, 16, 1258, 81, 14};

        int max = numberArrays[0];
        int min = numberArrays[0];



        for (int i = 0; i < numberArrays.length; i++) {
            if(numberArrays[i] > max) {
                max = numberArrays[i];
            }

            if (numberArrays[i] < min)
                min = numberArrays[i];
        }
        System.out.println("En buyuk deger: " + max);
        System.out.println("En kucuk deger: " + min);


    }
}
