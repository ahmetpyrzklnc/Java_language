public class Main {

    public static void main(String[] args) {
        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new TarimKrediManager()); // krediUI oluşturduğumuz için parametre olarak atayabiliriz.
       // krediUI.KrediHesapla(new ogretmenKrediManager()); // bu şekilde çağırabiliriz.
       // krediUI.KrediHesapla(new askerKrediManager());
    }
}
