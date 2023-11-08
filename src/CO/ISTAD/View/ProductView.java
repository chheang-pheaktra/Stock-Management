package CO.ISTAD.View;

import CO.ISTAD.Model.Product;
import static java.lang.System.*;
import java.util.List;

public class ProductView {
    public static void printList(List<Product> products){
       out.print("Product List");
       products.forEach(product ->{
           out.println("ID"+product.getId());
           out.println("NAME"+product.getName());
           out.println("QTY"+product.getQty());
           out.println("PRICE"+product.getPrice());
           out.println("IMPORT DATE"+product.getImportDate());
       });
    }
}
