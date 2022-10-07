public class Main {
    public static void main(String[] args) {
        Product product=new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Asus Laptop canavar");
        product.setPrice(5000);
        product.setStockAmount(100);
        product.setRenk("Ay kırmızı siyahı");

        ProductManager productManager=new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());


    }
}