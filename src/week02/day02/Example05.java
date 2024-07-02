package week02.day02;

public class Example05 {
    public static void main(String[] args) {
        //1'den 100'e kadar olan çift sayıların toplamının, tek sayıların toplamına olan oranını bulan program.

        int totalTek = 0;
        int totalCift = 0;
        double total;
        for (int i = 1; i <= 100 ; i++) {
            if(i % 2== 0)
            {
                totalCift += i;
            }
            else {
                totalTek += i;
            }
        }
        System.out.println("çift sayıların toplamı: " + totalCift);
        System.out.println("tek sayıların toplamı: " + totalTek);
        total = ((double) totalCift / totalTek);
        System.out.println("tek ve çift sayıların birbirine oranı: " + total);
    }
}
