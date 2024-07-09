package week03.day02;

public class Soru09 {
    public static void main(String[] args) {

        String[][] array = new String[10][10];

        for (int i = 0; i < array.length; i++) { //String[]
            for (int j = 0; j < array[i].length; j++) { //String []
                array[i][j] = (i+1) + " x " + (j+1) + " = " + ((i+1)*(j+1)); //1 * 1 = 1 gibi bir sonuç döndürür. 1 * 2 = 2, 1 * 3 = 3...
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
            System.out.println();
        }
    }
}
