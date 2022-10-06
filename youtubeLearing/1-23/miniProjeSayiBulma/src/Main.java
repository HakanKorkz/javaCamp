public class Main {
    public static void main(String[] args) {
        // benim algoritman
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 5;
        int bulunan = 0;


        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                bulunan = sayi;
                break;
            }
        }

        System.out.println("Bulunan sayı: " + bulunan);
        System.out.println("------------------------------------------------- ");

        // Engin hocanın algoritman
        int[] sayilar2 = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak2 = 5;
        boolean varMi = false;


        for (int sayi2 : sayilar2) {
            if (sayi2 == aranacak2) {
                varMi = true;
                break;
            }
        }


        if (varMi) {
            System.out.println("Sayı Mevcuttur");
        } else {
            System.out.println("Sayı Mevcut değildir");
        }




    }
}