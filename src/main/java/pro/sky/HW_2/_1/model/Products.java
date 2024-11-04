package pro.sky.HW_2._1.model;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Products {

    private final List<Integer> products;

    public Products(List<Integer> products) {
        this.products = products;
    }

    public List<Integer> addProducts(List<Integer> productList) {
        products.addAll(productList);
        return productList;
    }

    public List<Integer> getProducts() {
        return Collections.unmodifiableList(products);
    }
}
