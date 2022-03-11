public class Main {

    public static void main(String[] args) {
        double[] myList = {1.2, 1.3, 4.5, 6.3}; // listeyi tanımladık
        double total = 0; // toplam değişkeni atadık;
        double max = myList[0]; // en büyük sayıyı bulalım.
        // teker teker ekrana bastıralım;
        for (double number : myList) {
            if (max < number) { // kodları kıyas eder ve aşağıdaki yere ulaştırır;
                max = number;
            }
            total = total + number; //toplam alabiliriz.
            System.out.println(number); // liste içindeki sayıları yazdırdık
        }

        System.out.println("Toplam: " + total); // toplam değerini yazdırdık
        System.out.println("En büyük sayı:" + max); // en büyük sayıyı yazdırdık


        // Burada ise bir uygulama gerçekleştirdik;
    }
}
