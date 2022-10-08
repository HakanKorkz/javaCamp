public class ProductManager {
    public void add(Product product){
        ProductValidator validator =new ProductValidator();
        if (validator.isValid(product)){
            System.out.println("Eklendi");
        }
        else {
            System.out.println("geçersiz ürün bilgisi");
        }


    }
}
