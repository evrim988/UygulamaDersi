package week03.day02;

public class Soru05 {
    public static void main(String[] args) {

        int[] numberArray = {0, 120, 5, 85, -256, 16, 1258, 81, 14};
        int sum = 0;

        for (int i = 0; i < numberArray.length; i++) {

            sum += numberArray[i];

            if(numberArray[i] % 2 == 0)
                System.out.println(numberArray[i] + " sayisi cifttir");
            else
                System.out.println(numberArray[i] + " sayisi tektir.");
        }
        System.out.println("\nDizinin icindeki sayilarin toplami: " + sum);
    }
}
