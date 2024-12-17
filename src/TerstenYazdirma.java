import java.util.Scanner;

public class TerstenYazdirma {
    // Kullanıcının girdiği metni tersten yazdıran özyinelemeli metod
        public static void tersYazdir(String metin, int uzunluk) {
            if (uzunluk > 0) {
                // uzunluk > 0 yaptık çünkü son indisten ilk indise geldiğinde bitmesini istiyoruz.
                System.out.print(metin.charAt(uzunluk - 1));
                tersYazdir(metin, uzunluk - 1); // özyinelemeli kısım
                // uzunluk - 1 olmasının nedeni en son indisin bir üstte olması.
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Kullanıcıdan metni al
            System.out.println("Lütfen metni giriniz...");
            String metin = scanner.nextLine();
            // Metni tersten yazdır
            tersYazdir(metin, metin.length());
        }
    }


