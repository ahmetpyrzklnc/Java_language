public class Main {

    public static void main(String[] args) {
        String[][] sehirler = new String[3][3]; // 3x3'lük bir matrix tanımladık;
        // bölge ve sehir listesi tanımlayalım;

        sehirler[0][0] = "İstanbul";  // 3x3'ten 9 tane sehirler arrysi tanımlayalım
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik"; // 0'ıncı bizim marmara bölgemizi temsil etsin
        sehirler[1][0] = "Konya";
        sehirler[1][1] = "Ankara";
        sehirler[1][2] = "Kırşehir"; // 1'inci ise bizim İç anadolu bölgemizi temsil etsin;
        sehirler[2][0] = "İzmir";
        sehirler[2][1] = "Aydın";
        sehirler[2][2] = "Uşak"; // 2'incisi ise bizim Ege bölgemizi temsil etsin;

        // şehirleri örnek olarak yaptık,

        // bu şehirleri yazdırmak istersek iç içe döngü yapısı dediğimiz olayı kullanmamız gerekir;

        for (int i = 0; i <= 2; i++) { // bu şekilde yazdırırsak sadece 0,1,2 indisleri bize yazdırır.
            System.out.println("------------"); // şehirlerimiz birbirine girmesin;
            for (int j = 0; j <= 2; j++) { // bu şekilde dizimize derinlik kattık
                System.out.println(sehirler[i][j]); // şehirlerimizin tamamını yazdırdık
            }
        }
        System.out.println("-----------");
        System.out.println("Şehir-Bölge eşleştirmeniz tamamlanmıştır...");

        // Bu şekilde matrislerimizi yani çok boyutlu dizileri tanımlamış olduk;

    }
}
