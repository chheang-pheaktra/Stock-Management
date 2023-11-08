package CO.ISTAD.util;

import CO.ISTAD.Controller.MenuController;
import CO.ISTAD.Controller.ProductController;
import CO.ISTAD.Dao.ProductDaoIplm;

import java.util.Scanner;

public class singleton {
    //1 create state refer type
    private static  Scanner scanner;
    private static MenuController menuController;
    private static  ProductController controller;
    private static  ProductDaoIplm productDaoplm;

    //2 create get instance
    public static Scanner scanner(){
        if (scanner==null){
            scanner = new Scanner(System.in);
        }
        return scanner;
    }
    public static MenuController menuController(){
        if (menuController == null){
            menuController = new MenuController();
        }
        return menuController;
    }
    public static ProductController controller(){
        if (controller==null){
            controller = new ProductController();
        }
        return controller;
    }
    public static ProductDaoIplm productDaoIplm(){
        if (controller==null){
            productDaoplm = new ProductDaoIplm();
        }
        return productDaoplm;
    }

}
