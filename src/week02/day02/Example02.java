package week02.day02;

public class Example02 {
    public static void main(String[] args) {

        //a'dan z'ye alfabeyi yazdıralım.

        char karakter;
        for (karakter = 'A'; karakter <= 'Z'; karakter++){
            System.out.print(karakter);
        }

        System.out.println();

        char begin = 'a';
        char end = 'z';
        for (;begin<=end;begin++)
        {
            System.out.print(begin+" "); //aralarına boşluk koymuş oluyoruz.
        }
    }
}
