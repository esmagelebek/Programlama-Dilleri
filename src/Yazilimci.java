public class Yazilimci extends Muhendis{
    //Yazilimci classında 3 parametre alan constructor oluşturduk
    Yazilimci(String isim, String uzmanlik, String dil) {
        super(isim, uzmanlik); //üst sınıftaki 2 parametreli constructorına gider parametresine
                               // isim ve uzmanlık olarak verdiğimiz değerleri yazarız
        System.out.println("Kodlama dili: " + dil);//ekrana dil parametresinde hangisi yazıyorsa burda da o yazılır
    }
}
