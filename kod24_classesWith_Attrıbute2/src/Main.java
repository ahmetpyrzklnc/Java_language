public class Main {

    public static void main(String[] args) {
       Product product = new Product(1, "Asus", "ROG STRİX",7999,"Siyah");

//        Product product = new Product();
//        product.setName("Asus"); //ürün ismi eklettik
//        product.setId(1); // ürün kimliği
//        product.setDespription("ROG STRİX");   // ürün açıklaması
//        product.setPrice(7999); // fiyatı
//        product.setStockAmount(45);// stok adeti
//        product.setRenk("");


        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        // Çıktı ---- Ürün Eklendi Asus

        System.out.println(product.getKod()); // bu kodu sadece programcı görebilir. Kullanıcı göremez

    }
}
