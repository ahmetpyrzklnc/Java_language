public class Main {

    public static void main(String[] args) {
	        /* Stringler bizim kelimelerimizdir ve stringlerin her biri char dizisidir.
         yani sizin gireceğiniz her bir kelimenin indexi vardır ve bunlar numaralı halde bulunurlar

         Bir örnekle başlayalım
         */
        String message = "Bugün hava çok güzel."; // stringimizi değişken olarak tanımladık
        System.out.println(message); // ve yazdırdık.

        /* Yukarıda stringler bir char dizisi olduğu söylemiştik
        peki biz bu indisteki elemanına ulaşmamız mümkün müdür

        bunun için iki farklı fonksiyon vardır

        1* lenght yani uzunluk birimi

        2* charArt --- bir nevi arama motoru gibi düşünebiliriz

        */

        System.out.println("Eleman sayısı: " + message.length()); // burada uzunlukla 21 tane olduğu sonucu görürüz.

        // Aramak kısmına gelecek olursak;

        System.out.println("5. eleman: " + message.charAt(4)); // string içindeki harfi bulduk

        /* Burada isterseniz kontrol edebiliriz bildiğimiz gibi indisler 0'dan başlıyordu

        eğer biz bunu saymaya çalışırsak 4 indis 'n' harfi olurken indis harfimiz 5 olur.

        */

        // peki bu dizinimize bir şeyler eklemek istedik o zaman da concat fonksiyonunu kullanmamız gerekir.

        System.out.println(message.concat(" Yaşasın!")); // gördüğümüz gibi ekledik.

        // çıktı ----  Bugün hava çok güzel. Yaşasın!

        // Peki bu dizimizin hangi harfle başladığını bilmiyoruz ve girdiğimiz değerlerin doğru olup;
        // olmadığını test etmek istiyoruz o zaman ise startsWith fonksiyonunu kullanırız

        System.out.println(message.startsWith("B")); // true döndürür

        System.out.println(message.startsWith("b")); // false döndürür.;

        /* startswith boolean veri tipindedir sadece true veya false değeri döndürür.
        küçük b ile neden çalışmadığına gelirsek java case sensitivy duyarlılığı olan bir dildir.
        yani 'b' harfi ile 'B' harfi aynı değildir!

        bide bunun benzeri endswith vardır ama fonksiyon olarak tam tersidir.
        dizinin başından değil de sonundan aramaya başlar
        */

        System.out.println(message.endsWith(".")); // true döndürür.

        /* bir farklı fonksiyonumuz ise getChars'tır bu ise bizim başlangıç ve
        bitiş indislerimizi girdiğimiz harfleri string içinde bulup oluşturduğumuz dizinin içine atar

        */
        char[] karakterler = new char[5];  // karakter dizisi oluşturduk ve beş indisi olacak dedik
        message.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler); // Bugün harfini aldı.;


        /*
        Diğer bir fonksiyonumuz ise çokça da kullanacağımız indexOf fonksiyonudur.

        indexOf bizim bir nevi string içindeki arama motorumuzdur diyebiliriz

        misalen a harfini parametre olarak girersek bize string içinde kaçıncı indiste olduğu baştan
        arayarak bulur.
         */

        System.out.println(message.indexOf("av")); // 7 olarak bulur

        // bir diğeri ise last.indexof'tur bu ise stringin sonundan başlayarak bulur ama sağ
        // baştan başlayarak bize yine aynı indexi döndürür

        System.out.println(message.lastIndexOf("a")); // 9 olarak bulur

        // Bu kodumuz bu kadardı.


    }
}
