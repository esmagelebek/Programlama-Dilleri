import java.util.Scanner;

public class UsAlma {
    static int usAlma(int taban, int us){
        if(us == 0){
            return 1;
        }
        return usAlma(taban, us - 1) * taban;
    }
    public static void main(String[] args) {
        int taban, us;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban degerini giriniz : ");
        taban = scanner.nextInt();
        System.out.print("Us degeri giriniz : ");
        us = scanner.nextInt();

        System.out.println("Sonuc : " + usAlma(taban, us));
    }
}
