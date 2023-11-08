package CO.ISTAD;

import CO.ISTAD.Controller.MenuController;
import CO.ISTAD.Controller.ProductController;
import CO.ISTAD.util.singleton;

import java.util.Scanner;

public class MainApplication {
    private final Scanner scanner;
    private final MenuController menuController;
    private final ProductController productController;
    public MainApplication(){
        scanner= singleton.scanner();
        menuController =singleton.menuController();
        productController=singleton.controller();
    }
    private void run(){
        menuController.index();
        System.out.println("Enter Option: ");
        int option = Integer.parseInt(scanner.nextLine());
        switch (option){
            case 1 ->productController.index();
            default -> throw  new IllegalStateException();
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to PMS");
        new MainApplication().run();
    }
}
