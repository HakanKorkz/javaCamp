package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.loging.DatabaseLogger;
import oopWithNLayeredApp.core.loging.FileLogger;
import oopWithNLayeredApp.core.loging.Logger;
import oopWithNLayeredApp.core.loging.MailLogger;
import oopWithNLayeredApp.dataAcces.HibernateProductDao;
import oopWithNLayeredApp.dataAcces.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

    public static void main(String[] args) throws Exception {

        Product product = new Product(1, "İphone Xr", 90);

        Logger[] loggers={new DatabaseLogger(),new FileLogger(), new MailLogger()};

        ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product);

    }

}
