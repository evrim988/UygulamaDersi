package week03.day02;

public class Soru06 {
    public static void main(String[] args) {

        int[] intArray = {1,4,5,6,1,1,4,8};
        
        int sayac1 = 0,sayac4 = 0,sayac5 = 0,sayac6 = 0,sayac8 = 0;
        boolean tekrarMi = true;
        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i] == 1)
                sayac1++;
            else if (intArray[i] == 4) {
                sayac4++;
            } else if (intArray[i] == 5) {
                sayac5++;
            } else if (intArray[i] == 6) {
                sayac6++;
            } else if (intArray[i]==8) {
                sayac8++;
            }
        }

        if(sayac1 > sayac4)
            System.out.println(tekrarMi);
        if (sayac4 > sayac5) {
            System.out.println(tekrarMi);
        }

        System.out.println("1 sayisindan " + sayac1 + " adet var.");
        System.out.println("4 sayisindan " + sayac4 + " adet var.");
        System.out.println("5 sayisindan " + sayac5 + " adet var.");
        System.out.println("6 sayisindan " + sayac6 + " adet var.");
        System.out.println("8 sayisindan " + sayac8 + " adet var.");

        //2.çözüm
        int[] numberArr = {1,4,5,6,1,1,4,8};
        boolean isOneCountMore = true;
        int oneCount = 0;
        int fourCount = 0;

        for (int i = 0; i < numberArr.length; i++) {
            if (numberArr[i] == 1)
                oneCount++;
            else if (numberArr[i] == 4)
                fourCount++;

        }
        isOneCountMore = oneCount > fourCount;
        System.out.println(isOneCountMore);
    }
}
