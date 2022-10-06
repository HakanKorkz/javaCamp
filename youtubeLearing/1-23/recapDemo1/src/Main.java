public class Main {
    public static void main(String[] args) {
        System.out.println("--------------- Burası benim algortma yapım ---------------");

        // Benim algoritmam bu şekil dedir
        int sayi1 = 1;
        int sayi2 = 1;
        int sayi3 = 8;
        int buyukSayi = 0;
        String mesaj = "";
        if (sayi1 > sayi2) {
            buyukSayi = sayi1;
            mesaj = "Sayı 1 en Büyük değer sayı: " + buyukSayi;
        } else if (sayi2 > sayi1) {
            buyukSayi = sayi2;
            mesaj = "Sayı 2 en Büyük değer sayı: " + buyukSayi;

        } else if (sayi1 > sayi3) {
            buyukSayi = sayi1;
            mesaj = "Sayı 1 en Büyük değer sayı: " + buyukSayi;

        } else if (sayi3 > sayi1) {
            buyukSayi = sayi3;
            mesaj = "Sayı 3 en Büyük değer sayı: " + buyukSayi;

        } else if (sayi2 > sayi3) {
            buyukSayi = sayi2;
            mesaj = "Sayı 2 en Büyük değer sayı: " + buyukSayi;

        } else if (sayi3 > sayi2) {
            buyukSayi = sayi3;
            mesaj = "Sayı 3 en Büyük değer sayı: " + buyukSayi;

        } else {
            mesaj = "Sayılar eşittir";

        }


        System.out.println(mesaj);

        System.out.println("-----------------------------------------------------------");

        // Engin hocanın algoritması

        System.out.println("--------------- Engin hocanın algoritması ---------------");



        int sayi4 = 24;
        int sayi5 = 25;
        int sayi6 = 2;
        int enBuyuk = sayi4;
        if (enBuyuk <sayi5) {
            enBuyuk=sayi5;
        }

        if (enBuyuk<sayi6) {
            enBuyuk=sayi6;
        }

        System.out.println("En büyük: "+enBuyuk);




        System.out.println("---------------------------------------------------------");



    }
}