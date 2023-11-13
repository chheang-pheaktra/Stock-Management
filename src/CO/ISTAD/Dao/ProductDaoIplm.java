package CO.ISTAD.Dao;

import CO.ISTAD.Model.Product;
import CO.ISTAD.database.ProductDataBase;
import CO.ISTAD.exception.ProductNotFound;

import java.util.List;
import java.util.Optional;

public class ProductDaoIplm implements ProductDao {
    private final ProductDataBase productDataBase;
    public ProductDaoIplm(){
        productDataBase =new ProductDataBase();
    }
    @Override
    public Product insert(Product product) {
        productDataBase.getProducts().add(product);
        return product;
    }

    @Override
    public List<Product> select() {
        return productDataBase.getProducts();
    }

    @Override
    public Optional<Product> selectById(Long id) {
       return productDataBase.getProducts().stream()
                .filter(product -> product.getId().equals(id))
                .findFirst();
    }

    @Override
    public Product UpdateById(Product product) {
        return productDataBase.getProducts().stream()
                .filter(pro->pro.getId().equals(product.getId()))
                .map(newPro->product)
                .findFirst()
                .orElseThrow(()->new ProductNotFound(String.format(
                        "Product ID %s does not exist in DB",product.getId())));
    }

    @Override
    public Product DeleteById(Long id) {
        Product foundProduct= productDataBase.getProducts().stream()
                .filter(pro->pro.getId().equals(id))
                .findFirst()
                .orElseThrow(()->new ProductNotFound(String.format(
                        "Product ID %s does not exist in DB",id)));
        productDataBase.getProducts().remove(foundProduct);
        return foundProduct;
    }

    @Override
    public List<Product> selectByName(String name) {
        return productDataBase.getProducts().stream()
                .filter(product -> product.getName().toLowerCase().contains(name.toLowerCase()))
                .toList();
    }
}
