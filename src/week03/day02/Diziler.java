package week03.day02;

public class Diziler {
    public static void main(String[] args) {

        //Aynı türde çoklu veri saklar.
        //Boyutu sabittir. Bir kere boyutlandırıldı mı, bir daha yeniden boyutlandırılma doğrudan yapılamaz.

        String[] stringArray = new String[4];
        System.out.println(stringArray.length);
        //burada dizi nin uzunluğunu(boyutunu) almış oluruz.


        boolean[] booleanArray = new boolean[3];
        System.out.println(booleanArray[0]); //booleanArray dizisinin 0.indexdeki değerini döndürür.
        //boolean lar default false değerini alır.Bir değer vermedik.
        System.out.println(stringArray[1]); //null değerini döner. Çünkü herhangi bir değeri yok.

        //System.out.println(stringArray[5]); //burada hata veir çünkü belirlediğimiz boyutun dışına çıkmış oluruz.
        //Array Index Out Of Bounds hatası vermiş olur.

        System.out.println(booleanArray[0] = (3 == (1 + 2)));
        //parantez içersindeki ifadelerin önce toplama işlmeini yapar ve çıkan sonuç 3e eşit mi diye bakar.
        // Eğer sonuç 3e eşitse booleanArray dizisindeki 0.index değerine true değerini dönüş olur. Çünkü 3 3e eşit olmuş olur.

        int[] inArr;

        int[] intArr = new int[3];
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2]= 3;

        String[] stringArrays = new String[2];
        stringArrays[0] = "Evrim";
        stringArrays[1] = "Çalışkan";

        //dizinin elemanlarını ekrana yazdırma
        for (String item:stringArrays){
            System.out.println(item);
        }

        String[] stringArray2 = {"KElime1","Kelime2"};
        int[] numberArray = {1,2,3};
        //bu şekilde 2 türlü olarak tanımlayabiliriz.

    }
}
