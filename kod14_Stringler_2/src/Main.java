public class Main {

    public static void main(String[] args) {
        // Stringler konumuzla devam edelim;

        String message = "Bugün hava çok güzel."; // aynı stringi tanımlayalım;
        System.out.println(message);

        // Replace metodu ya da fonksiyonu ilgili metnimizdeki ifadeleri değiştirmemize olanak sağlar;
        // Genellikle nokta virgül gibi ifadelerde değişiklik yapılacağı zaman kullanılır.

        System.out.println(message.replace(' ', '-')); // Boşlukları sildi ve yerine '-'koydu.

        // Şuna diikat edelim bu mesajın yerini almaz isterseniz alttaki kodu commandtan çıkarın ve çalıştırın
        //System.out.println(message); // gördüğünüz gibi olmadı.

        // Bunu yapmanız için değişken olarak atama yapmanız gerekmektedir; Şu şekilde yapılır.

        String newMessage = message.replace(' ', '-'); //değişkene atadık.
        System.out.println(newMessage); // ve yazdırdık sonuç olarak kodu çalıştırırsak görebiliriz:

        // Bir diğer fonksiyonumuz substring. Substring bize string içinden bizim kesit almamıza olanak sağlar;

        System.out.println(message.substring(2, 5)); // 'gün'

        // Burada stringimizin ikinci indisinden başladı ve beşinci indisimize kadar kesti ve bize döndürdü.
        // Beşinci indisi dahil etmez :)

        // peki şu şekil olsaydı ne olurdu?

        System.out.println(message.substring(2)); // gün hava çok güzel.

        //ikinci indisten başladı ve metnin sonuna kadar kesip ekrana bastırdı.

        // Bir diğer fonksiyonumuz ise split. Split ise kelimeleri teker teker ayırarak dizi oluşturmamıza;
        // olanak sağlar kısa bir for döngüsüyle anlatalım;

        for (String kelime : message.split(" ")) { // boşluklardan böldük.
            System.out.println(kelime); // alt alta yazdırdı
        }

        // diğer bir fonksiyonumuz ise toLowerCase. Bu fonksiyon bizim string içimizdeki bütün harfleri
        // küçük harfe dönüştürmemize olanak sağlar;

        System.out.println(message.toLowerCase()); // bugün hava çok güzel.

        // Bunun tam tersi fonksiyonda vardır.

        // toUpperCase ise bizim string içindeki bütün harflerimizi büyük harfe çevirir;

        System.out.println(message.toUpperCase());  // BUGÜN HAVA ÇOK GÜZEL.

        // Son olarak trim fonksiyonu var. Trim ise bizim string ifademizdeki başında ve sonunda bulunan boşlukları
        //siler.

        // Yukarıdaki değişkeni bozmamak adına yeni bir değişken atıyorum siz istersenizbu değişkeni silip;
        // yukarıdaki değişkeni aynen kullanabilirsiniz;

        String deneme = "    Bu bir trim denemesidir.    ";
        System.out.println(deneme); // görüldüğü gibi boşluklu oldu

        System.out.println(deneme.trim());   // 'Bu bir trim denemesidir.'

        // İsterseniz yukarıdaki değişkenin önüne ve sonuna bir miktar boşluk bırakın ve şu kodu çalıştırın.

        // System.out.println(message.trim()); // yine aynı sonucu alırsınız.

        // trim ifadesi genellikle yabancı bir veritabanıyla çalıştığımız zaman kaynak uyuşmazlığını önlemek için;
        // kullanılır.


        // Stringler konumuz bu kadardı.
    }
}
