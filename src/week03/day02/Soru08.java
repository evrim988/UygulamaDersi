package week03.day02;

public class Soru08 {
    public static void main(String[] args) {

        String cityStr = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya";
        String[] cityArray = cityStr.split(";"); //dizinin içindeki ; ifadelerinden itibaren parçalara ayırır. Ver her bir elemanı String dizisine aktardı.
        int index;
        String cityName = "";
        String plateNumber = "";
        for (String item : cityArray) { //02-Adıyaman
            index = item.indexOf("-"); //tire ifadesinin index ini yakalmaya çalıştık. //2. index tireye denk geliyor.
            cityName = item.substring(index+1);
            plateNumber = item.substring(0,index);
            System.out.println(cityName + " plaka numarası: " + plateNumber);
        }
    }

}

