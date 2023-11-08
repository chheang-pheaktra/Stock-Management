package CO.ISTAD.Service;

import CO.ISTAD.Dao.ProductDao;
import CO.ISTAD.Dao.ProductDaoIplm;
import CO.ISTAD.Model.Product;
import CO.ISTAD.exception.ProductNotFound;

import java.util.List;

public class ProductServiceViewplm implements ProductService {

    private final ProductDao productDao;
    public ProductServiceViewplm(){
        productDao=new ProductDaoIplm();
    }
    @Override
    public Product insert(Product product) {
        return productDao.insert(product);
    }

    @Override
    public List<Product> select() {
        return productDao.select();
    }

    @Override
    public Product selectById(Long id) {
        return productDao.selectById(id).orElseThrow(()->new ProductNotFound(String.format("" +
                "Product ID %s does not exist in DB",id)));

    }

    @Override
    public Product UpdateById(Product product) {
        return productDao.UpdateById(product);
    }

    @Override
    public Product DeleteById(Long id) {
        return productDao.DeleteById(id);
    }

    @Override
    public List<Product> selectByName(String name) {
        return productDao.selectByName(name);
    }
}
