public class Main {

    public static void main(String[] args) {
        char harf = 'A'; // Kıyas edeceğimiz harfi burada girişini yaptık

        switch (harf) {  // switch blokuyla kalın sesli harflerimizi tanımladık
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harfler."); // case içindeki bütün harfler eğer yukarıdayla uyumluysa;
                // bu çıktıyı çalıştıracak.
                break;  // döngüyü kırmamız gerekir
            default: // eğer yukarıdaki switch çalışmazsa burayı baz alacak
                System.out.println("İnce sesli harfler."); // ve bu çıktıyı ekranımıza bastıracak

        }

        // Bu şekilde girilen harfi bize kalın mı yoksa ince mi olduğunu bildirecek bir program yazdırdık.
    }
}
