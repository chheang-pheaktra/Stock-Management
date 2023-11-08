package CO.ISTAD.Service;

import CO.ISTAD.Model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product insert(Product product);
    List<Product> select();
    Product selectById(Long id);
    Product UpdateById(Product product);
    Product DeleteById(Long id);
    List<Product> selectByName(String name);
}
