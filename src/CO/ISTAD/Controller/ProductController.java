package CO.ISTAD.Controller;

import CO.ISTAD.Model.Product;
import CO.ISTAD.Service.ProductService;
import CO.ISTAD.Service.ProductServiceViewplm;
import CO.ISTAD.View.ProductView;

import java.util.List;

public class ProductController {
    private ProductService productService;
    public ProductController(){
        productService=new ProductServiceViewplm();
    }
    public void index(){
        List<Product>products =productService.select();
        ProductView.printList(products);
    }
}
