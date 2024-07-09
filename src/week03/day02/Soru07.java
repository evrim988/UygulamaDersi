package week03.day02;

public class Soru07 {
    public static void main(String[] args) {

        int[] array = {1, 13, 13, 13, 5, 13};
        int toplam = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] != 13)
                toplam += array[i];
        }
        System.out.println(toplam);

        for (int i = 0; i < array.length-1; i++) {
            if(array[i] == 13 && array[i+1] != 13)
                    toplam += array[i+1];
        }
        System.out.println("Toplam: " + toplam);
    }
}
