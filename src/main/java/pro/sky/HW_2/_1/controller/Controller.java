package pro.sky.HW_2._1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.HW_2._1.service.CartService;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/store/order")
public class Controller {
    private final CartService cartService;

    public Controller(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public void addProduct(@RequestParam("Id") List<Integer> ids) {
        cartService.add(ids);

    }

    @GetMapping("/get")
    public Collection<Integer> get () {
        return cartService.get();
    }
}
