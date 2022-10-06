public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"Laptop","Monster Laptop",5000,1,"Siyah");

//        product.setName("Laptop");
//        product.setId(11);
//        product.setDescription("Asus Laptop");
//        product.setPrice(5000);
//        product.setStockAmount(3);
//        product.setFarben("gri");
//        product.getCod();

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getCod());









    }
}
