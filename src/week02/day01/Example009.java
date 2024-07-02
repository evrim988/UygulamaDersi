package week02.day01;

public class Example009 {
    public static void main(String[] args) {

        int i = 1;
        int total =0;
        int limit = 50;
        /*for(total =0; total <=50; i++){
            total +=i;
            System.out.println(total);
            System.out.println(i);
        }*/

        while (total<=limit){
            total += i;
            i++;
        }

        System.out.println("Toplam: " + total + "\nDongu: " + (i-1));
        //döngüden çıkmadan önce i yi 1 arttırıp öyle çıkıyor. O yüzden i - 1 yapıyoruz.
    }
}
