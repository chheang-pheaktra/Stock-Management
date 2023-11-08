package CO.ISTAD.database;

import CO.ISTAD.Model.Product;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ProductDataBase {
    private List<Product> products ;
    public ProductDataBase(){
        products=new ArrayList<>();
        products.add(new Product(1L,"Coca",100,2500.00, LocalDateTime.now()));
        products.add(new Product(2L,"Pepsi",100,2500.00, LocalDateTime.now()));
        products.add(new Product(3L,"Angkor Puro",100,2500.00, LocalDateTime.now()));
    }
    public List<Product> getProducts(){
        return products;
    }
}
