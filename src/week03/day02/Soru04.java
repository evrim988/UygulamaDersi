package week03.day02;

public class Soru04 {
    public static void main(String[] args) {

        int[] numberArr = {2, -256, 2, 1258, 2, 2};
        boolean isRepating = false;

        for (int i = 0; i < numberArr.length -1; i++) {
            if(numberArr[i] == 2 && numberArr[i+1] == 2) {
                isRepating = true;
                break;
            }
        }
        System.out.println(isRepating);
    }
}
