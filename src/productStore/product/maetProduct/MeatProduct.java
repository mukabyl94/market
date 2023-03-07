package productStore.product.maetProduct;

public class Meat extends SuperMarket {
    public Meat(String productOne, String productTwo, String productThree) {
        super(productOne, productTwo, productThree);
    }

    public Meat() {
    }

    @Override
    public String toString() {
        return "Meat{}";
    }
}
