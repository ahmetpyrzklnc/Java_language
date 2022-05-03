public class BaseKrediManager {
    // bütün kredi managerların atası burası
    // hepsi buradan extends ile miras alacak ve hesaplatacak
    public double hesapla(double tutar){ // hesaplama olduğu için double tuttuk
       return tutar * 1.18; // hepsini 1.18 ile hesapladık
        // ogrenciKrediManager hariç !
    }

    // çünkü ogrenciKrediManager'da overriding yaptığımız için yukarıdaki 1.18 ezildi ve 1.10 kullandı

    // eğer ki ezilmemesini istiyorsak public final double... diye yazdırmamız gerekir
    // o zaman herhangi bir ezilme söz konusu olmaz.
}

// buradaki işlemlerin tamamına overridable adı verilir.