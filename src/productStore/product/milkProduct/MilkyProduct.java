package productStore.product.milkProduct;

import productStore.product.Product;

import java.time.LocalDate;

public abstract class MilkyProduct extends Product {
    public MilkyProduct(int id, String name, String companyName, LocalDate date) {
        super(id, name, companyName, date);
    }

    @Override
    public String toString() {
        return "Product " +
                " id " + getId() +
                " name " + getName() +
                " companyName " + getCompanyName() +
                " date " + getDate();
    }
}
