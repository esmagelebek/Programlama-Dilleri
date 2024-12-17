package HesapMakinesi;

public class HesapMakinesi {
    public double Toplama(double a,double b,double c,double d){
        return a+b+c+d;
    }


    //geriye doble değeri döndüren bir fonksiyon tanımladım bu fonksiyon toplama işlemini yapıp değeri bize dödürür
    //Double tanımlamamın sebebi hem tam sayıları toplayabilir hem de virgüllü sayıları toplayabilir
    // kullanım alanı daha geniş bu yüzden double tercih ettim
    //iki tane sayının toplanması için bu fonksiyon kullanılacak
    public double Toplama(double a,double b){
        return a+b;
    }
    //Bu da üç tane sayının toplanması işlemini yapan fonksiyondur burda toplama fonksiyonunu aşırı yükleme yaptım
    // yani fonksiyon ismi aynı ancak parametre sayısı veya farklıysa method aşırı yükleme olur
    public double Toplama(double a,double b,double c ){
        return a+b+c;
    }
    //Burda da yine çıkarma işleminin sonucunu geriye döndüren bir fonksiyon tanımladım
    public double Cikarma(double a,double b){
        return a-b;
    }
    //Çarpma işleminin sonucunu geriye değer döndürür, iki sayı çarpılacaksa bu fonksiyon kullanılır
    public double Carpma(double a,double b){
        return  a*b;
    }
    //Çarpma işleminin sonucunu geriye değer döndürür, üç sayı çarpılacaksa bu fonksiyon kullanılır
    //çarpma fonksiyonu da aşırı yüklenmiş oldu fonksiyon ismi aynı ancak parametre sayısı farklı
    public double Carpma(double a,double b,double c){
        return a*b*c;
    }
    //Bu fonksiyon bölme işlemini yapan ve geriye değerini döndüren fonksiyondur
    //bölen b'dir bölen 0 olursa bölme işlemi tanımsızdır bu yüzden geriye 0 değerini döndürür
    //eğer bölen yani b 0 değilse sorunsuz bir şekilde işlem devam eder
    public double Bolme(double a,double b){
        if (b!=0){
            return a/b;
        }else {
            System.out.println("Bölen 0 olamaz");
            return 0;
        }
    }
    //a^b işlemini yapan fonksiyondur  bu işlemin sonucunu geriye değer döndürür
    // Bu işlemi yapmak için math kütüphanesinin hazır üs alma metodunu kullandım
    public double usAlma(double taban,double us){
        return Math.pow(taban,us);
    }
    //0'dan küçük sayıların karekökü olmaz bu yüzden if döngüleri ile burda onun kontrolü yapılıyor
    //eğer 0'dan büyükse javadaki math kütüphanesindeki hazır metod yardımıyla işlem düzgün şekilde yapılır
    //eğer 0'dan küçükse bize uyarı verir ve geriye 0 değerini döndürür
    public double karekokAlma(double a){
        if (a!=0){
            return Math.sqrt(a);
        }else {
            System.out.println("Negatifin Karekökü olmaz!!!!!!");
            return 0;
        }
    }
    //Derece cinsindeki açıyı radyan cinsine çevirir  ve bulduğu değeri geriye döndürür
    public double sin(double a){
        return Math.sin(Math.toRadians(a));
    }
    //Derece cinsindeki açıyı radyan cinsine çevirir  ve bulduğu değeri geriye döndürür
    public double cos(double a){
        return Math.cos(Math.toRadians(a));
    }
    //Derece cinsindeki açıyı radyan cinsine çevirir  ve bulduğu değeri geriye döndürür
    public double tan(double a){
        return Math.tan(Math.toRadians(a));
    }
    //negatif değerin logaritması olmaz bu yüzden kontrolü if döngüsü ile sağlarız
    //eğer 0'dan küçükse hata mesajı yazılır ve geriye 0 değeri döner
    //0'dan büyükse javadaki math kütüphanesindeki hazır log metodu ile değer bulunmuş olur
    public double Logaritma(double a){
        if (a>0){
            return Math.log(a);
        }else{
            System.out.println("Hatalı değer girdiniz!!!!");
            return 0;
        }
    }
    //negatif sayının faktöriyeli olmaz if ile sayının kontrolü yapılır
    //eğer sayı 0 veya 1 ise faktöriyel değeri 1 olur
    //eğer sayı 0 veya 1'den farklı ise faktöriyeli for döngüsü yardımıyla yapar
    public double FaktoriyelHesapla(int a){
        if (a<0){
            System.out.println("Negatif sayının faktöriyeli olmaz ! Düzgün değer gir!!!!!!");
            return 0;
        } else if (a==0 || a==1) {
            return 1;
        }else {
            int faktoriyel= 1;
            for (int i=1;i<=a;i++){
                faktoriyel*=i;
            }
            return faktoriyel;
        }
    }



}
