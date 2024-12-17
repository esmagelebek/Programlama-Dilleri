public class Kus extends Hayvan{
    Kus(String isim, String tur) {
        super(isim); //hayvan sınıfındaki parametreli constructor kullanılır
        System.out.println("Tür: " + tur);
    }
}
