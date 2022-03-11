public class Main {

    public static void main(String[] args) {
        System.out.println("Öğrenci sayımız: 12");
        System.out.println("Öğrenci sayımız: 12"); //burada 3 tane değişken tanımladık
        System.out.println("Öğrenci sayımız: 12");
        // diyelim ki bizim burada bir değişkeni değiştirmek istedik ve
        // biz bu değişkeni kodun 600 yerinde kullandık burada tek tek uğraşıp değiştirmemiz mi gerekir
        // cevap tabiki hayır örneklerle tane tane anlatacağım.;

        int ogrenciSayisi = 15;
        System.out.println("Öğrenci sayımız : 12" + ogrenciSayisi); // bu şekilde yaparsak sayıları yan yana koyar;
        System.out.println("Öğrenci sayımız : " + ogrenciSayisi);  // 12'yi sildik ve yerine 15 yazdırdık.;
        System.out.println(ogrenciSayisi);  // görüldüğü gibi bize burada direkt 15 değerini döndürdü;
        // peki stringlerde değişiklik yapmamız mümkün müdür? evet!;


        // yine aynı şekilde yukarıdaki gibi öğrenci tanımlayalım ama önce stringi de tanımlayalım

        int ogrenciSayi = 20;
        String message = "Öğrenci sayısı:";
        System.out.println(message + ogrenciSayi);  //çıktı Öğrenci sayısı:20;
        // görüldüğü gibi bu şekilde farklı farklı yerlerde kullanmamız mümkün hale geldi.;

        System.out.println(message + ogrenciSayi);

        // kodlarımızı bu şekilde tanımlayabiliriz

    }
}
