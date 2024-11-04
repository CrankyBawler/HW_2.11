package pro.sky.HW_2._1.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
@Component
@SessionScope
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
