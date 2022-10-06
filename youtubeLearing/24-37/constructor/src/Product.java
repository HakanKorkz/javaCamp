public class Product {
    // over loading işlemi
    public Product(int id, String name,String description,double price, int stockAmount, String farben) {
        System.out.println("Yapıcı Blog Çalıştı");
        this.id=id;
        this.name=name;
        this.description=description;
        this.price=price;
        this.stockAmount=stockAmount;
        this.farben=farben;
    }
    public Product() {

    }

    // Attribute & Field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String farben;
    private String cod;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getFarben() {
        return farben;
    }

    public void setFarben(String farben) {
        this.farben = farben;
    }

    public String getCod() {
        return this.name.substring(0, 1) + id;
    }


}


























