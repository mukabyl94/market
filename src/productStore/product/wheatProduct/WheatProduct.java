package productStore.product.wheatProduct;

public class Wheat extends SuperMarket {
    public Wheat(String productOne, String productTwo, String productThree) {
        super(productOne, productTwo, productThree);
    }

    public Wheat() {
    }

    @Override
    public String toString() {
        return "Wheat{}";
    }
}
