public class Hayvan {
    //Hayvan classının constructorı oluşturduk ve eğer constructor zinciri buraya gelirse
    //Hayvan oluşturuldu ekrana yazdırılır.
   public Hayvan() {
        System.out.println("Hayvan oluşturuldu");
    }
    //hayvan sınıfından parametreli constructor oluşturduk
   public Hayvan(String isim) {
        System.out.println("Hayvan adı: " + isim);
    }
}

