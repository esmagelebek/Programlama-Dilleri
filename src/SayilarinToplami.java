import java.util.Scanner;

public class SayilarinToplami {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Sayı giriniz: ");
            int sayi = scanner.nextInt();
            System.out.println("1-" + sayi + " sayılarının toplamı: " + topla(sayi));

            // 1-n'e kadar olan sayıların toplamı formülü ==> (n * (n + 1)) / 2
            System.out.println("1-" + sayi + " sayılarının toplamı: " + (sayi * (sayi + 1)) / 2);
        }
        public static int topla(int sayi) {
            if (sayi == 1)
                return 1;
            return sayi + topla(sayi - 1);
        }
    }


