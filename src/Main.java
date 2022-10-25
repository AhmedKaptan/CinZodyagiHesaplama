import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kalan = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Doğum yılını giriniz:");
        int yil = inp.nextInt();

        kalan = yil % 12;
        if (kalan == 0) {
            System.out.println("Çin zodyağı Burcunuz : Maymun");
        }
        if (kalan == 1) {
            System.out.println("Çin Zodyağı Burcunuz: Horoz");
        }
        if (kalan == 2) {
            System.out.println("Çin Zodyağı Burcunuz: Köpek");
        }
        if (kalan == 3) {
            System.out.println("Çin Zodyağı Hesap : Domuz");
        }
        if (kalan == 4) {
            System.out.println("Çin Zodyağı Burucunuz : Fare");
        }
        if (kalan == 5) {
            System.out.println("Çin Zoydağı Burcunuz : Öküz");
        }
        if (kalan == 6) {
            System.out.println("Çin Zodyağı Burucunuz : Kaplan");
        }
        if (kalan == 7) {
            System.out.println("Çin Zodyağı Burcunuz: Ejderha");
        }
        if (kalan == 8) {
            System.out.println("Çiz Zodyağı Hesaplama : Ejderha");
        }
        if (kalan == 9) {
            System.out.println("Çin Zodyağı Hesaplama");
        }
        if (kalan == 10) {
            System.out.println("Çin Zodyağı Hesaplama : At");
        }
        if (kalan == 11) {
            System.out.println("Çin Zodyapı Hesaplama : Koyun");
        }
    }
}
