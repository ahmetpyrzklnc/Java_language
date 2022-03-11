public class Main {

    public static void main(String[] args) {
        // Diziler - Arraysler

        // Diziler bizim aslında kayıt defterimizmiş gibi düşünebiliriz;
        // Diyelim ki bir öğretmen öğrencilerini kaydetmek istiyor o zaman şçyle uzun bir yol;
        // izlemesi gerekir;

        String ogrenci1 = "Engin";
        String ogrenci2 = "Ali";
        String ogrenci3 = "Merve";
        String ogrenci4 = "Deniz";
        String ogrenci5 = "Kıvanç";

        // bu şekilde öğrencilerini tek tek girmesi gerekir;
        // öğrencilerini ekrana bastırmak isterse de hepsini print diyerek yazdırması gerekir;
        // o da şu şekilde olur;

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);
        System.out.println(ogrenci5);

        // Bu şekilde teker teker listenin üstünde gezindik tabi ki bu zahmetli bir iş oldu;
        // diziler ise bunu daha kısa yoldan yapmamıza olanak sağlar;

        System.out.println("-----------------"); // çıktıları ayırmak için kullandım konuyla alakası yok;

        String[] ogrenciler = new String[5];  // stringin içindeki sayı nufusu belirtir;
        ogrenciler[0] = "Engin"; // indisler her zaman 0'dan başlar;
        ogrenciler[1] = "Ali";
        ogrenciler[2] = "Merve";
        ogrenciler[3] = "Deniz";
        ogrenciler[4] = "Kıvanç"; // bu şekilde sınıfı tanımladık.;
        //  ogrenciler[5] = "Hasan";          // bu kod ise bize hata verir çünkü dizi uzunluğunu aşar.;

        // peki bu liste arasında dolaşmak istiyorsak bunu nasıl yapabiliriz;
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        // bu şekilde bir for döngüsüyle listede dolaştık.;


        // for döngüsünün şöyle bir kullanımı da vardır ve programlamada genellikle bu tercih edilir;


        System.out.println("---------------"); // yine çıktılar karışmasın diye koydum.;

        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }

        // Genel olarak dizilerin mantığı bu şekildeydi;

    }
}
