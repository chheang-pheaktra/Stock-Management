package CO.ISTAD.Dao;

import CO.ISTAD.Model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductDao {

    //CRUD
    Product insert(Product product);
    List<Product> select();
    Optional<Product> selectById(Long id);
    Product UpdateById(Product product);
    Product DeleteById(Long id);
    List<Product> selectByName(String name);
}
