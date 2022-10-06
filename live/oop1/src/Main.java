import oop1.CorporateCustomer;
import oop1.Customer;
import oop1.IndividualCustomer;
import oop1.Product;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();

        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image.jpeg");

        Product product2 = new Product();

        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(1);
        product2.setUnitPrice(1000);
        product2.setUnitsInStock(5);
        product2.setImageUrl("image2.jpeg");


        Product product3 = new Product();

        product3.setName("Kitchen Kahve Makinesi");
        product3.setDiscount(8);
        product3.setUnitPrice(200);
        product3.setUnitsInStock(4);
        product3.setImageUrl("image3.jpeg");


        Product[] products = {product1, product2, product3};
        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");


        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05555");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Hakan");
        individualCustomer.setLastName("Korkmaz");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCustomerNumber("8895");
        corporateCustomer.setCompanyName("Korkmaz Millennium");
        corporateCustomer.setTaxNumber("5555622542");
        corporateCustomer.setPhone("55555");

        Customer[] customers={individualCustomer,corporateCustomer};














    }
}