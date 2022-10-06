public class Main {
    // reucibility <== Bir kere yaz aynı şeyi tekrar tekrar kullan
    public static void main(String[] args) {
        // java case sensitive  duyarlı
        // Değişken kelimeleri ilk harf küçük başlar camil case yazılır
        int ogrenciSayi = 11;
        String mesaj = "Öğrenci Sayısı : ";
        System.out.println(mesaj + ogrenciSayi);
        System.out.println(mesaj + ogrenciSayi);
        System.out.println(mesaj + ogrenciSayi);
        System.out.println(mesaj + ogrenciSayi);
    }
}