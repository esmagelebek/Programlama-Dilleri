public class Muhendis extends Calisan{
    //Classla aynı isimde constructor oluşturulur
    Muhendis(String isim, String uzmanlik) {
        super(isim); //isim parametresini Calisan classındaki
                    // bir parametreli constructora parametre olarak gönderdik
        System.out.println("Uzmanlık alanı: " + uzmanlik);
    }
}
