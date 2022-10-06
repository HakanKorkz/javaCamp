package oopWithNLayeredApp.dataAcces;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
    public void add(Product product) {

        // sadece ve sdadece db erişim kodları yazılır

        System.out.println("JDBC ile veritabanına eklendi");

    }


}
