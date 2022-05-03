public class Main {

    // overriding üzerine yazma anlamına gelir.
    // Bazı durumlarda miras alınan şeylerde o mirastan gelen şeyleri değiştirmek
    // istersek bu zaman overriding kullanmamız gerekir

    public static void main(String[] args) {
        BaseKrediManager[] krediManagers = new BaseKrediManager[] // hepsinde hesaplaması için bir dizi tanımladım
                {new ogretmenKrediManager(), new TarimKrediManager(), new ogrenciKrediManager()}; // dizi elemanları

        for (BaseKrediManager krediManager : krediManagers){ // basit bir for döngüsüyle bütün kredi methodlarını hesaplattık
          System.out.println(krediManager.hesapla(1000));
        }
        // çıktı
        // 1180.0 --- ogretmen kredisi hesaplaması
        // 1180.0 ---- tarim kredisi hesaplandı
        // 1100.0 ---- override edilen ogrenci kredisi hesaplandı


        // tek tek hesaplamak istersek bu şekilde kullanmamız gerekir

//	ogretmenKrediManager ogretmenKrediManager = new ogretmenKrediManager();
//    System.out.println(ogretmenKrediManager.hesapla(1000));
    }
}
