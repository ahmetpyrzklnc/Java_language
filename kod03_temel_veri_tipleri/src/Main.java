public class Main {

    public static void main(String[] args) {
        int sayi = 10;
        System.out.println(sayi); // bu şekildeki sayıları integerla tutmamız mümkündür.//
        // peki bu integerin sınırı var mıdır evet vardır örnek aşağıda//

        int numara = 256374; //sınırı budur. fazlasını eklersek hata verir.
        // istersen deneyebilirsin.;

        float a = (float) 1.1236253;  // float değerini bu şekilde kullanabiliriz.;
        System.out.println(a);  // ve bunun sınırı tabiki vardır.
        // bunun abisi diyebileceğimiz ise double'dır. Double bizim rasyonel sayılarımızın en;
        // küçük halini bile girmemize olanak sağlar.;


        double b = 12.56647837467388487373784937783;  // bu şekilde listeyi uzatıp gidebiliriz.//
        System.out.println(b);  //doubleda bahsedeceklerimiz bu kadar 8 bytelık veri kapladığını da unutmamakta;
        // fayda var.;


        long c = 1636727382;  // javanın en büyük tam sayı değerini tutan veri yapısıdır.;
        System.out.println(c); // konumu itibariyle integerdan hem hacim olarak büyük bir yapıya sahiptir.;
        // bu şekilde uzun bir sayıyı tutmak istersek longu kullanabiliriz.;
        // 8 bytelık veri depolar.

        byte d = 127;  // Javanın en kompleksli veri tipidir. -128 ile 127 arasında veri tutar.;
        System.out.println(d); // eğer 128 değerini girerseniz hata alırsınız.;


        char karakter = 'A'; // eğer ki '' ifadesi değilde "" ifadesi kullanmış olsaydık bunu string olarak;
        System.out.println(karakter);  // algılayıp hata verecekti syntaxa dikkat edilmesi gerekir.;

        // bir önemli nokta ise bizim burada tek bir haft girmemiz gerekir atıyorum ANKARA yazarak girmeye çalışırsak;
        // bize hata verir çünkü ANKARA kelimesi bir char değil stringdir.;
        // ANKARA yazdırmak istiyorsak string kullanmamız gerekir.;


        boolean dogruMu = false; // boolean ise sadece true ve false değerlerini tutar.;
        System.out.println(dogruMu); // 1 bytelık veri tutar.;
        // Genellikle şart yapılarında kullanılır o yüzden burada bunun hakkında anlatılacak pek birşey yoktur.;
        // Şart yapılarında daha net bir şekilde anlaşılacaktır.;


        // Veri tiplerinde genel olarak anlatılacak konular bu kadardı.;

    }
}
