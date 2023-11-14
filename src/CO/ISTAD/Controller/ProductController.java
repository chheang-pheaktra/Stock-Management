package CO.ISTAD.Controller;

import CO.ISTAD.Dao.ProductDaoIplm;
import CO.ISTAD.Model.Product;
import CO.ISTAD.Service.ProductService;
import CO.ISTAD.Service.ProductServiceViewplm;
import CO.ISTAD.View.ProductView;
import CO.ISTAD.util.singleton;

import java.time.LocalDateTime;
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
    public void Create(){
        System.out.println("Enter Product ID: ");
        long ProId = Integer.parseInt(singleton.scanner().nextLine());
        System.out.println("Enter Product Name: ");
        String ProName=singleton.scanner().nextLine();
        System.out.println("Enter Product QTY: ");
        int Qty = Integer.parseInt(singleton.scanner().nextLine());
        System.out.println("Enter Product Price: ");
        Double ProPrice= Double.parseDouble(singleton.scanner().nextLine());
        Product AddPro = new Product(ProId,ProName,Qty,ProPrice, LocalDateTime.now());
        Product product = productService.insert(AddPro);
    }
    public void delete(){
        System.out.println("Enter  ID for delete:  ");
        long ProId = Integer.parseInt(singleton.scanner().nextLine());
        Product product = productService.DeleteById(ProId);
    }
    public void update(){

    }
}