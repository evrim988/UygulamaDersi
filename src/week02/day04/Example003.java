package week02.day04;

public class Example003 {
    /*"Java,React,Spring" String degerinden bir for döngüsü içerisinde Java React ve Spring i ayrı ayrı yazdıralım.*/
    public static void main(String[] args) {

        String value = "Java,React,Spring";
        int index = 0;

        for (int i = 0; i < value.length(); i++) {
            if(value.charAt(i) == ','){
                System.out.println(value.substring(index,i));
            }
        }

    }
}
