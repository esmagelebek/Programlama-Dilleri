package HesapMakinesi;

public class Main {
    public static void main(String[] args) {
        //Hesapmakinesi sınıfındaki metodları kullanmak için o sınıftan bir nesne üretiyoruz
        // bunun yardımıyla o classtaki metodları bu sınıfta rahat bir şekilde kullanıyoruz
        HesapMakinesi hesapMakinesi=new HesapMakinesi();

        //burda toplama işlemini yapıyor ve işlemin sonucunu konsola yazdırıyoruz(4 parametreli fonksiyon)
        System.out.println("Toplama İşleminin Sonucu : "+ hesapMakinesi.Toplama(2.3,4.5,6.8,9.8));
        //burda bölme işlemini yapıyor ve işlemin sonucunu konsola yazdırıyoruz
        System.out.println("Bölme İşleminin Sonucu : "+hesapMakinesi.Bolme(2.0,1.0));

        //burda sinüs işlemini yapıyor ve işlemin sonucunu konsola yazdırıyoruz
        System.out.println("Sinüs Değer : "+ hesapMakinesi.sin(30));

        //burda çarpma işlemini yapıyor ve işlemin sonucunu konsola yazdırıyoruz(iki parametreli fonksiyon)
        System.out.println("Çarpma İşleminin Sonucu : "+ hesapMakinesi.Carpma(4.5,3.4));

        //burda çarpma işlemini yapıyor ve işlemin sonucunu konsola yazdırıyoruz(3 parametreli fonksiyon)
        System.out.println("Çarpma İşleminin Sonucu : "+ hesapMakinesi.Carpma(4.5,3.4,6.5));

        //burda kosinüs işlemini yapıyor ve işlemin sonucunu konsola yazdırıyoruz
        System.out.println("Kosinüs Değer : "+ hesapMakinesi.cos(90));

        //burda çıkarma işlemini yapıyor ve işlemin sonucunu konsola yazdırıyoruz
        System.out.println("Çıkarma İşleminin Sonucu : "+ hesapMakinesi.Cikarma(9.0,2.3));

        //burda faktöriyel işlemini yapıyor ve işlemin sonucunu konsola yazdırıyoruz
        System.out.println("Faktöriyel İşleminin Sonucu : "+ hesapMakinesi.FaktoriyelHesapla(5));

        //burda Karekök işlemini yapıyor ve işlemin sonucunu konsola yazdırıyoruz
        System.out.println("Karekök İşleminin Sonucu : "+ hesapMakinesi.karekokAlma(4));

        //burda Logaritma işlemini yapıyor ve işlemin sonucunu konsola yazdırıyoruz
        System.out.println("Logaritma İşleminin Sonucu : "+ hesapMakinesi.Logaritma(4));

        //burda Tanjant işlemini yapıyor ve işlemin sonucunu konsola yazdırıyoruz
        System.out.println("Tanjant Değer : "+ hesapMakinesi.tan(45));

        //burda toplama işlemini yapıyor ve işlemin sonucunu konsola yazdırıyoruz(3 parametreli fonksiyon)
        System.out.println("Toplama İşleminin Sonucu : "+ hesapMakinesi.Toplama(2.3,5.4,6.5));

        //burda toplama işlemini yapıyor ve işlemin sonucunu konsola yazdırıyoruz(iki parametreli fonksiyon)
        System.out.println("Toplama İşleminin Sonucu : "+ hesapMakinesi.Toplama(4.5,6.7));

        //burda üs alma işlemini yapıyor ve işlemin sonucunu konsola yazdırıyoruz
        System.out.println("Üs Alma İşleminin Sonucu : "+ hesapMakinesi.usAlma(3,4));

    }
}
