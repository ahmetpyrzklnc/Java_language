public class Main {

    public static void main(String[] args) {
        int numara1 = 19; // öncelikle bir sayı tanımlayalım.
        if (numara1 < 20) {
            System.out.println("Numara1 20'den küçüktür.");

            // burada birşart sağladık dedik ki;
            // kodumuza bizim girdiğimiz sayıyı kontrol et eğer sayı 20'den küçükse;
            // bize printi yazdır dedik;


            // peki bu sayıya 20 deseydik veya integer içindeki sayıyı 20'den büyük yazsaydık ne olurdu;
            // sonucu boş olarak döndürecekti.;
        }
        int numara2 = 24; // başka bir değişken atayalım yine
        if (numara2 < 20) {
            System.out.println("Numara2 20'den küçüktür."); // kodumuzda şuanda bu şartı sağlamıyor.
        } else {
            System.out.println("Numara2 20'den büyüktür."); // if şartı sağlanmadığında ise bu sefer else devreye girer.;
        }  // çıktısı  Numara2 20'den büyüktür.


        // peki diyelim ki 20'ye eşitlik olursa da ekrana eşittir bastırmak istiyoruz diyelim;
        // bunu kullanmak istersek ise else if yapısını kullanmamız gerekecek
        // bu şekilde üç farklı değişkeni tanımlamamız mümkün olacaktır.
        // aşağıdaki örneği inceleyelim


        int numara3 = 20; // yine değişken atayalım
        if (numara3 < 20) {
            System.out.println("Numara3 20'den küçüktür."); // yine aynı iskeleti oluşturuyoruz.
        } else if (numara3 == 20) {
            System.out.println("Numara3 20'ye eşittir."); // eğer ki if yapısı sağlanmadı bu sefer burayı çalıştırıyoruz.//
        } else {
            System.out.println("Numara3 20'den küçüktür."); // en son burayı bize değer olarak döndürecektir.;
        }

        // Bu şekilde kod bloklarından hata almamız en aza indirgenir. Kodda boşa atmayacaktır bizi;
        // İf, else if, else'nin mantığı pyhtonla aynıdır. 'if,elif,else';
        // Anlamadığımız zaman pyhton notlarına bakabilirsin.   ;

        // if, else if, else mantığı bu kadardı.;


    }
}
