public class Main {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
            case 'C':
                System.out.println("Çok güzel : Geçtiniz");
                break;
            case 'D':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef kalınız : Geçtiniz");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
        }


    }


}