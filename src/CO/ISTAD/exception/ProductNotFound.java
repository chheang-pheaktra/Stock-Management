package CO.ISTAD.exception;

import CO.ISTAD.Dao.ProductDaoIplm;

public class ProductNotFound extends RuntimeException{
    public ProductNotFound(String message){
        super(message);
    }
}
