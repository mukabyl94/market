import productStore.product.Product;

import java.time.LocalDate;
import java.util.*;

public class StoreService {
    private final List<Product>products1 = new ArrayList<>();
    public void addProduct(List<? extends Product>products){

        List<Product> products2 = new ArrayList<>();
        for (Product product : products) {
            if (product.getCompanyName().equals("TOIBOSS") || product.getCompanyName().equals("MILKA") || product.getCompanyName().equals("NUR")){
                if (product.getDate().isAfter(LocalDate.now())){
                    products1.add(product);
                }
                else {
                    products2.add(product);
                }
            }else {
                products2.add(product);
            }
        }
        System.out.println("\u001B[32m" + "Кабыл алынган продуктылар:" + "\u001B[0m");
        products1.forEach(System.out::println);
        System.out.println("\u001B[31m" + "Кабыл алынбаган продуктылар:" + "\u001B[0m" );
        products2.forEach(System.out::println);

    }
    public void checkProducts(List<Product>products){
        List<Product> products2 = new ArrayList<>();
        List<Product> delet = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getDate().isAfter(LocalDate.now())){
                if (products.get(i).getDate().minusDays(7).isBefore(LocalDate.now())){
                    products2.add(products.get(i));
                }
            }else {
                delet.add(products.get(i));
                products.remove(products.get(i));
            }
        }
        System.out.println();
        products2.forEach(System.out::println);
        System.out.println();
        delet.forEach(System.out::println);
    }
    public void meneger(List<Product>products){
        Map<String, String> mapMeneger = new HashMap<>();
        mapMeneger.put("Mukabyl", "nm");
        Scanner scan = new Scanner(System.in);
        System.out.println("Login Parol jazynyz");
        String login = scan.nextLine();
        String paroll = scan.nextLine();
        for (Map.Entry<String, String> name: mapMeneger.entrySet()){
            if (login.equals(name.getKey()) && paroll.equals(name.getValue())) {
                addProduct(products);
                checkProducts(products1);
            }
        }

    }
}
