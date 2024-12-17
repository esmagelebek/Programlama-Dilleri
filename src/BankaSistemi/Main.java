package BankaSistemi;

import java.util.Scanner;

public class Main {
       public static void main(String[] args) {
              //Kullanıcının hesap numarasını girdiği
              // ve para çekme para yatırma güncel bakiyeyi görme gibi işlemlerin test edildiği classdır
              Scanner scanner=new Scanner(System.in);
              System.out.println("Lütfen banka hesap numaranızı Giriniz: ");
              String hesapNumarasi=scanner.nextLine();
              BankaHesapMetodlar bankaHesap=new BankaHesapMetodlar(hesapNumarasi);
              System.out.println(bankaHesap.getHesaptakiBakiye());
              bankaHesap.paraCekme(120.0);
              bankaHesap.paraYatirma(1200.5);
              bankaHesap.setHesaptakiBakiye(1575.6);
              bankaHesap.setHesapNumarasi("");
              System.out.println("Hesap bakiyeniz : "+ bankaHesap.BakiyeSorgulama());

       }
}
