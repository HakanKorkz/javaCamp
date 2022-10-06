public class Main {
    public static void main(String[] args) {
        System.out.println("test");
        // değişkem isimlendirmeleri java'da camelCase yazılır
        String ortaMetin = "İlginizi çekebilir";
        String altMetin = "vade süresi";

        System.out.println(ortaMetin);
        //intieger
        int vade = 12;
        // double
        double dolarDun = 18.25;
        double dolarBugun = 18.30;

        boolean dolarNeDustuMu = false;

        String okYonu = "";

        if (dolarBugun < dolarDun) { // true döner
            okYonu = "down.svg";
            System.out.println(okYonu);
        } else if (dolarBugun > dolarDun) {
            okYonu = "up.svg";
            System.out.println(okYonu);
        } else {
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }

        String kredi1 = "Hızlı Kredi";
        String kredi2 = "Kredi X";
        String kredi3 = "Kredi Y";

        // array
        String[] krediler = {"Hızlı Kredi", "Maşını Halkbantan", "Mutlu Emekli"};

        System.out.println(krediler[0]);
        System.out.println(krediler[1]);
        System.out.println(krediler[2]);

        for (int i=0; i<krediler.length; i++){
            System.out.println(krediler[i]);
        }




    }
}