import productStore.product.Product;
import productStore.product.maetProduct.Fish;
import productStore.product.milkProduct.Yogurt;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Fish(1, "fish1", "TOIBOSS", LocalDate.of(2023,3,10)));
        products.add(new Fish(2, "fish2", "TOIBOSS", LocalDate.of(2023,3,1)));
        products.add(new Fish(3, "fish3", "TOIBOSS", LocalDate.of(2023,4,12)));
        products.add(new Fish(4, "fish4", "TOIBOSS2", LocalDate.of(2023,4,14)));
        products.add(new Fish(5, "fish5", "TOIBOSS", LocalDate.of(2023,3,4)));
        products.add(new Fish(6, "fish6", "TOIBOSS", LocalDate.of(2023,5,25)));
        products.add(new Fish(7, "fish7", "TOIBOSS4", LocalDate.of(2023,5,8)));
        products.add(new Fish(8, "fish8", "TOIBOSS", LocalDate.of(2023,3,8)));
        products.add(new Yogurt(1,"Yogurt1", "MILKA", LocalDate.of(2023,3,13)));
        products.add(new Yogurt(2,"Yogurt2", "MILKA", LocalDate.of(2023,3,12)));
        products.add(new Yogurt(3,"Yogurt3", "MILKA", LocalDate.of(2023,3,2)));
        products.add(new Yogurt(4,"Yogurt4", "MILKANEW", LocalDate.of(2023,3,4)));
        products.add(new Yogurt(5,"Yogurt5", "MILKA", LocalDate.of(2023,3,15)));
        products.add(new Yogurt(6,"Yogurt6", "MILKA", LocalDate.of(2023,3,30)));
        products.add(new Yogurt(7,"Yogurt7", "MILKACOW", LocalDate.of(2023,3,5)));
        products.add(new Yogurt(8,"Yogurt8", "MILKA", LocalDate.of(2023,3,19)));
        products.add(new Yogurt(9,"Yogurt9", "MILKA", LocalDate.of(2023,3,20)));

//        List<Product> storeCase = new ArrayList<>();
//        List<Product> vitrina = new ArrayList<>();
        StoreService storeService = new StoreService();
//        storeService.addProduct(products,storeCase);
//        storeService.checkProducts(storeCase,vitrina);
        storeService.meneger(products);


    }
}