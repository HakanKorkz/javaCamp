public class Main {
    public static void main(String[] args) {
        ProductManager manger=new ProductManager();
        Product product=new Product();
        product.price=10;
        product.name="mouse";
        manger.add(product);
    }
}