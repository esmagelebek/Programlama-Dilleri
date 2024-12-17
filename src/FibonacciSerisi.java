
public class FibonacciSerisi {


    public static int fibonacciSerisi(int n) {
        if (n == 1|| n==2) { //Burda ilk iki elemanın 1 olduğunu belirtir
            return 1; //bu yüzden bir döndürmesi gerekir.
        }

        return fibonacciSerisi(n - 1) + fibonacciSerisi(n - 2); //1 1 2
        // fibonacciSerisi(3) = fibonacciSerisi(2)+fibonacciSerisi(1)
        // yani 1+1=2 diyip 3. elemana 2 değerini vermiş oluyoruz.
        // bu yüzden bu seriyi yaparken recursive metot kullanmış oluruz.
        //recursive metot ,metot içinde yine kendisini çağırmak anlamına gelir.
    }

    public static void main(String[] args) {
        /*
        Fibonacci serisi 1 1 2 3 5 8 13 ... şeklinde ilerler
        yani kendisinden önceki iki elemanın toplamı olarak bir seri oluşturur
         */
        for (int i=1;i<6;i++)//burda da i=1 ilk elemanı temsil ediyor 0. eleman yok bu yüzden 1'den başlattım
            // 6 dememdeki sebep seride 5 eleman olsun istiyorum
          System.out.print(fibonacciSerisi(i)+"\t");//serideki her bir elemanı konsola yazdırıyoruz
    }
}
