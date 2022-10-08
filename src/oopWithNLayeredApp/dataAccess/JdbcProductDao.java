package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
    public void add(Product product) {
        //Sadece DB erişim kodları buraya yazılır
        System.out.println("Jdbc ile veritabanına eklendi");
    }


}
