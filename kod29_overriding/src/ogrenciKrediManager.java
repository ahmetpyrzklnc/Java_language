public class ogrenciKrediManager extends BaseKrediManager {
    // bu sayfa önemli
    public double hesapla(double tutar){ // overriding tam olarak burası
        return tutar * 1.10; // aynı baseKredi ile aynı keyworde sahip olduğu için onu ezdi bunu kullandı
    }

}
