public class Kopek extends Hayvan {
    //Kopek classının constructorıdır
    //super(); ise Kopek classının üst sınıfının constructorını ifade eder yanı Hayvan classının constructorı ilk çalışır
    // daha sonra bu constructor içindeki kod çalışır yani sout yazan kod çalışır
   public Kopek() {
        super();
        System.out.println("Köpek oluşturuldu");
    }
}
