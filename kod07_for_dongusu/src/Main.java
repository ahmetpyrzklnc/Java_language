public class Main {

    public static void main(String[] args) {
        // Döngü yapıları - for

        // döngülerin genel mantığı şu şekildedir:
        // Diyelim ki biz birden 10'a kadar ki sayıları ekrana yazdırmamız gerekiyor.
        // Bunu iki yoldan çözebiliriz.
        // 1.yol
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);

        System.out.println("Döngü bitmiştir.");

        // görüldüğü gibi çok zahmetli bir iş bu yüzden döngüler hem kod tasarrufu sağlarken hem de vakit kazandırır.
        // gelelim 2.yönteme

        // 2.yol
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Döngü bitmiştir."); // döngümüzün dışında olduğu için tek sefer yazdıracak.

        // görüldüğü gibi kısaca yazdırdık peki bu nasıl çalışıyor?

        // for döngüsü i sayısına atadığımız değerden başlatarak operatöre gidiyor;
        // operatör misalen yukarıdaki i++ operatörü sayıyı 1 arttırmamızı söylüyor. ;
        // operatör sayıyı arttırıp ekrana yazdırıyor ve ekrana yazdırdığı değeri bu sefer döngünün en başına;
        // gönderiyor. döngü bu şekilde ilerliyor. Ta ki döngü içindeki bir sayı bu durumu bozduğunda döngü;
        // sona eriyor. ve ekrana tamamen bitiriyor;


        // Bilmemiz gereken operatörler;
        // <= --- küçük eşittir.
        // >= --- büyük eşittir.
        // i++ --- i sayısını 1 arttır.
        // i+=2 --- i sayısını 2 arttır.
        // i = 1 --- başlangıç sayısı 1 oldu.;

        // peki sadece birden 10'a kadar mı değer yazdırabiliriz;
        // çift veya tek sayıları da yazdırmamız mümkündür.;

        //  for(int i=2;i<=10;i+=2); {
        //   System.out.println();
        //  }
        // System.out.println("Çift sayılar ekrana bastırılmıştır.");

        // yukarıda i tanımlı olduğu için hata aldık.


        //  for(int i=2;i<=10;i+=2); {
        //   System.out.println();
        //  }
        // System.out.println("Çift sayılar ekrana bastırılmıştır.");


        // Bu şekilde bu for döngülerimizi anlatmış olduk.
    }
}
