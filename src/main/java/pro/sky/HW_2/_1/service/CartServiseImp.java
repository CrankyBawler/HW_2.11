package pro.sky.HW_2._1.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.HW_2._1.model.Products;

import java.util.List;

@Service
public class CartServiseImp implements CartService {

    private final Products products;

    public CartServiseImp(Products products) {
        this.products = products;
    }

    @Override
    public List<Integer> add(List<Integer> id) {
        return products.addProducts(id);
    }

    @Override
    public List<Integer> get() {
        return products.getProducts();
    }

}
