public class Product {

// constructor
    public Product(int id, String name, String despription,double price,String renk){
        System.out.println("Yapıcı blok çalıştı.");
        this.id = id;
        this.name = name;
        this.despription = despription;
        this.price = price;
        this.renk = renk;
    }

//    public Product(){
//
//    }
    // Bir ürünün özelliklerini tanımlatalım
    // attrıbute - field
    private int id;
    private String name; // ürün isminin attribute'ını main.java'ya göndermek için burada tanımlatattık
    private String despription; // Ürün türü
    private double price; //fiyatı
    private int stockAmount; // stok sayısı
    private String renk;
    private String kod;
    // private-- gizli / public -- açık kaynak

    //getter
    public int getId(){ // getirmek
        return id;
    }

    //setter
    public void setId(int id){ // düzenlemek derlemek
        this.id=id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDespription() {
        return despription;
    }

    public void setDespription(String despription) {
        this.despription = despription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1) + id;
    }



}
