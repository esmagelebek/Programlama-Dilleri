package BankaSistemi;

import java.util.Scanner;

public class BankaHesapMetodlar {
    //Hesap numarasi ve hesap baiyesini private olara tanmladım
    //hesap numarası string olarak tanımladım bakiyeyi ise double olarak tanımladım
    private String hesapNumarasi;
    private double hesaptakiBakiye;
    //Hesap numarasını değiştirmek istersek diye de set metodu oluşturdum
    public void setHesapNumarasi(String hesapNumarasi) {
        this.hesapNumarasi = hesapNumarasi;
    }
    //Hesaptaki bakiye de değiştirilebilir bu yüzden onun içinde set metodu tanımladım
    // bu classda tanımlanan hesap bakiyesine set fonksiyonun içine verilen parametreyi atadım
    public void setHesaptakiBakiye(double hesaptakiBakiye) {
        this.hesaptakiBakiye = hesaptakiBakiye;
    }


     //Banka Hesap metodlar classının constructor'ı
     public BankaHesapMetodlar(String hesapNumarasi){
         this.hesapNumarasi=hesapNumarasi;
         this.hesaptakiBakiye=150000.0;
     }
     //Burda da hesap numarası tipi string
     // bu yüzden get metodu da aynı veri tipinde olmalı ve
     // hesap numarasını bize döndürmesini sağladım
    public String getHesapNumarasi() {
        return hesapNumarasi;
    }

    //Burda da hesaptaki bakiye tipi double
    // bu yüzden get metodu da aynı veri tipinde olmalı ve
    // hesaptaki bakiyeyi bize döndürmesini sağladım
    public double getHesaptakiBakiye() {
        return hesaptakiBakiye;
    }


    //Burda para yatırma işlemini yapan metodu tanımladım geriye değer döndürmesine gerek yok
    // bu yüzden de void tipi ile tanımladım
    //yatırılacak miktar 0'dan büyükse bunu hesaptaki bakiyeye sorunsuz eklicek ve güncel bakiyeyi bize göstericek
    //eğer sıfırdan küçükse uyarı mesajı yazdırıcak
    public void paraYatirma(double yatirilacakMiktar){
         if (yatirilacakMiktar>0){
             hesaptakiBakiye+=yatirilacakMiktar;
             System.out.println("İşlem başarılı :)" + hesaptakiBakiye);

         }else {
             System.out.println("İşlem başarısız :(");
         }
    }
    //Para çekme işlemi için void tipli fonksiyon tanımladım
    //çekilecek miktar 0'dan büyükse ve hesaptaki bakiyeden küçük veya eşitse işlem sorunsuz şekilde yapılacak
    //ve güncel bakiyede ekrana yazdırılacak
    //çekilmek istenen tutar tam tersi eğer hesaptaki bakiyeden büyük veya 0'dan küçükse işlem başarısız olur
    // ve ekrana hata mesajı yazdırılır
    public void paraCekme(double cekilecekMiktar) {

        if (cekilecekMiktar > 0 && cekilecekMiktar <= hesaptakiBakiye) {
            hesaptakiBakiye -= cekilecekMiktar;
            System.out.println("İşleminiz başarıyla gerçekleşti :)) Yeni hesap bakiyeniz :" + hesaptakiBakiye);
        } else {
            System.out.println("Geçersiz tutar veya yetersiz bakiye");
        }
    }
    //Kullanıcı sadece hesabındaki bakiyeyi öğrenmek de isteyebilir
    // bu yüzden bize bakiyeyi döndüren bir fonksiyon tanımladım
    //hesapBakiye değişkeni double bu yüzden bu fonksiyonun tipi de double olmalı
    public double BakiyeSorgulama(){
         return hesaptakiBakiye;
    }





}
