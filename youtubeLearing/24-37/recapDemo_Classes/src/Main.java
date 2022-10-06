public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int sonuc1 = dortIslem.Topla(3, 4);
        int sonuc2 = dortIslem.Cikar(5, 6);
        int sonuc3 = dortIslem.Carp(8, 2);
        int sonuc4 = dortIslem.Bol(10, 2);
        System.out.println(sonuc1);
        System.out.println(sonuc2);
        System.out.println(sonuc3);
        System.out.println(sonuc4);
    }
}
